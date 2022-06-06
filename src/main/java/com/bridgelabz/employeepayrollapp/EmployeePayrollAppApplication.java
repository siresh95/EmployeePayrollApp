package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.ApplicationContext;


import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
@EnableSwagger2
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll App Started in {} Environment", Context.getEnvironment().getProperty("environment"));
    }
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bridgelabz.employeepayrollapp")) // Note basepackage should we same line Number 1 in main class like,com.bridgelabz.employeepayrollapp;
                .build();
    }
}
