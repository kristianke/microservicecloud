package com.cssth.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyZuul_9527App {
    public static void main(String[] args) {
        SpringApplication.run(MyZuul_9527App.class,args);
    }
}
