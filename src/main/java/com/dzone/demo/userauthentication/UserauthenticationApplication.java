package com.dzone.demo.userauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
@EnableJpaRepositories(basePackages = {"com.apiworld.demo.userauthentication.userregistration.domain","com.apiworld.demo.userauthentication.login.domain"},entityManagerFactoryRef = "entityManagerFactory")

public class UserauthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserauthenticationApplication.class, args);
	}

}
