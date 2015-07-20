package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/html/", "classpath:/html/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/", "classpath:/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/", "classpath:/js/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/", "classpath:/fonts/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("forward:/index.html");
    }
}
