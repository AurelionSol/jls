package com.qpanda.jls.Config;


import com.qpanda.jls.Interceptor.BackInterceptor;
import com.qpanda.jls.Interceptor.ForeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

    @Bean
    public HandlerInterceptor getForeInterceptor() {
        return new ForeInterceptor();
    }

    @Bean
    public HandlerInterceptor getBackInterceptor() {
        return new BackInterceptor();
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }

    /**
     * 以前要访问一个页面需要先创建个Controller控制类，在写方法跳转到页面
     * 在这里配置后就不需要那么麻烦了，直接访问http://10.2.3.235:80/toLogin就跳转到login.html页面了
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:adminIndex.html");
    }

    /**
     * 拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(getBackInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("/admin/login");
//        registry.addInterceptor(getForeInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin", "/admin/**", "/js/**", "/css/**", "/img/**");

    }

}
