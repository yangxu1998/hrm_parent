package com.yangxu.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp9527.class);
    }
}