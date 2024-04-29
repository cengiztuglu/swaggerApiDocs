package com.example.swaggerApiDocs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition (
		info = @Info(
				title = "MyApiDocProject",
				version="1.0.0",
				description = "this project SwaggerApiDocs 101",
				termsOfService = "ctuglu",
				contact = @Contact
						(
								name ="Cengiz Tuglu",
								email = "cngztuglu@gmail.com"
						),
				license = @License
						(
								name="license",
								url="ct.com"
						)
		)
)
public class Swagger3ApiDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger3ApiDocsApplication.class, args);
	}

}
