package ru.Books.MavenBooks;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public final class MavenBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenBooksApplication.class, args);
	}

}
