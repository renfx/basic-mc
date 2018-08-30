package com.rfxdevelop.basicmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.rfxdevelop.basicmvc")
@ServletComponentScan(basePackages = "com.rfxdevelop.basicmvc.filter")
@MapperScan("com.rfxdevelop.basicmvc.dao")
public class DevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelopApplication.class, args);
    }
}
