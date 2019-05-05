package com.qpanda.jls.Service;

import org.springframework.stereotype.Service;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@Service
public class CodeServiceImpl implements CodeService {
    @Override
    public String getReturn(String code) {
        //新建java文件将获得到的字符串保存为java代码
        String source = code;
        File folder = new File("./src/main/java/com/qpanda/jls/Controller");
        File sourceFile = new File(folder, "Main.java");
        File consoleFile = new File(folder, "console.txt");
        File classfile = new File(folder, "Main.class");
        PrintStream out = System.out;
        try {
            Files.write(sourceFile.toPath(), source.getBytes(StandardCharsets.UTF_8));
            //将控制台重定向到文件
            FileOutputStream fos = new FileOutputStream(consoleFile);
            PrintStream ps = new PrintStream(fos);
            System.setOut(ps);
            //编译
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            if (compiler == null) {
                System.out.println("-------JDK required (running inside of JRE)-------");
            } else {
            }
            int compilationResult = compiler.run(null, null, null, sourceFile.getPath());
            if (compilationResult == 0) {
                System.out.println("-------编译成功------");
            } else {
                System.out.println("------编译失败------");
                return "编译失败";
            }
            //反射执行方法
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{folder.toURI().toURL()});
            Class<?> cls = Class.forName("Main", true, classLoader);
            Object instance = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getDeclaredMethod("main", String[].class);
            String returnValue = (String) method.invoke(instance, (Object) new String[]{"111", "222", "333"});
            if (returnValue != null) {
                System.out.println(returnValue);
            }
            //获取执行结果
            consoleFile.delete();
            sourceFile.delete();
            classfile.delete();
            return result(consoleFile);
        } catch (Exception e) {
            return e.toString();
        }finally {
            //恢复默认控制台输出
            System.setOut(out);
            //删除临时文件
            consoleFile.delete();
            sourceFile.delete();
            classfile.delete();
        }
    }

    private String result(File consoleFile) {
        StringBuilder result = null;
        BufferedReader br;
        String s = null;
        try {
            result = new StringBuilder();
            br = new BufferedReader(new FileReader(consoleFile));//构造一个BufferedReader类来读取文件

            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
