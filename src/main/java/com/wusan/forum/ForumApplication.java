package com.wusan.forum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@MapperScan("com.wusan.forum.mapper")
//关闭Security
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ForumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumApplication.class, args);
    }

}
