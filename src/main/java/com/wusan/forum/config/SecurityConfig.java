package com.wusan.forum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

        @Autowired
        private UserDetailsService userDetailsService;

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception{
            auth.userDetailsService(userDetailsService).passwordEncoder(password());
        }


    @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.formLogin()
                    .loginPage("/login.html")//设置登陆界面
                    .loginProcessingUrl("/adminlogin")//设置登陆提交的controller地址
                    .failureForwardUrl("/loginError")//失败后跳转controller的地址
                    .defaultSuccessUrl("/Customer").permitAll()//设置登陆成功后跳转路径
                    .and().authorizeRequests()
                            //同时设置静态资源不拦截释放
                         .antMatchers("/","/css/**","/js/**","/img/**","/static/**","/index.html").permitAll()//设置那些路径可以直接访问，不需要认证
                    .anyRequest().authenticated()
                    .and().sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
                    .invalidSessionUrl("/login.html")
                    .and().csrf().disable()//管理csrf防护模式
                    .headers().frameOptions().disable();//因为Security安全性问题，导致页面无法在frame中嵌套，解决无法嵌套问题

        }




        //密码加密
        @Bean
            PasswordEncoder password(){
                return new BCryptPasswordEncoder();
            }


}