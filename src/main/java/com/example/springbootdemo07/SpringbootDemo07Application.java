package com.example.springbootdemo07;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.springbootdemo07.mapper")
public class SpringbootDemo07Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo07Application.class, args);

    }
}
