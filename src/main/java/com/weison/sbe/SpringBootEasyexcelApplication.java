package com.weison.sbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;


@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
public class SpringBootEasyexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEasyexcelApplication.class, args);
    }

}
