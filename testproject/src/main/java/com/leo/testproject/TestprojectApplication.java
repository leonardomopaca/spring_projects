package com.leo.testproject;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

	@Bean //é um metodo que o spring usa de configuração para subir a aplicação
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new Info()
						.title("")
						.version("1.0")
						.termsOfService("http://swagger.io.terms")
						.license(new License().name("Apache 2.0")
								.url("http://springdoc.org")));
	}
}
