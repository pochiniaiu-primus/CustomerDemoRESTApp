package com.serhiihonchar.customerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = CustomerRestControllerV1.class)
public class CustomerDemoSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerDemoSpringBootAppApplication.class, args);
    }

}
