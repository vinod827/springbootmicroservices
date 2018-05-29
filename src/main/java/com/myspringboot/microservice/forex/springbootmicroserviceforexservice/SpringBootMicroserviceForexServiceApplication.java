package com.myspringboot.microservice.forex.springbootmicroserviceforexservice;

import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myspringboot.microservice.controller.ForexController;


/*@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivery.repository")*/


/*@SpringBootApplication (exclude=SecurityAutoConfiguration.class)
@ComponentScan(basePackageClasses = ForexController.class)
@EnableJpaRepositories("com.myspringboot.microservice.jpa.repository")
@EntityScan("com.myspringboot.microservice.entity")
//@ComponentScan({"com.myspringboot.microservice"})
*/


@SpringBootApplication
public class SpringBootMicroserviceForexServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
		System.out.println("###################################");
		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for(String bean: beans) {
			System.out.println("Sorted beans: "+bean);
		}
	}
}
