package com.weison.sbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@ServletComponentScan
public class SpringBootEasyExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEasyExcelApplication.class, args);
    }

}
