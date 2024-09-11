package com.krillinator.ws_lektion_10_service_bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsLektion10ServiceBeanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(WsLektion10ServiceBeanApplication.class, args);

		// IOC Container Content
		for (String bean: applicationContext.getBeanDefinitionNames()) {
			System.out.println(bean);
		}

		System.out.println(applicationContext);

	}

	// Creation of bean, being put automatically in IOC Spring Container
	@Bean
	public String myTestBean() {

		return "";
	}

}
