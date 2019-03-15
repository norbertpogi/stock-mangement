package com.pccw.crm.stockmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan({"com.pccw.crm.stockmanagement"})
public class StockmanagementApiApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {		
		System.setProperty("server.servlet.context-path", "/crm-stockmanagement-api");
		SpringApplication.run(StockmanagementApiApplication.class, args);
	}

}
