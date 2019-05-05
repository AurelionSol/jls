package com.qpanda.jls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qpanda.jls.Dao")
public class JlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JlsApplication.class, args);
    }

}

