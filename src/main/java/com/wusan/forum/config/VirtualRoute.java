package com.wusan.forum.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//设置虚拟路径，便于前段页面访问
@Component
public class VirtualRoute implements WebMvcConfigurer {
    /*
    * 配置虚拟路径
    * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("file:C:/Users/29659/Desktop/forum/src/main/resources/static/img/");
        /*
        * /img/**是设置的虚拟路径地址
        *   file:D:/ForumImg/是本地路径地址，file不可删除
         */
    }
}
