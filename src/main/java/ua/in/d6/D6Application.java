package ua.in.d6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ua.in.d6.domain")
public class D6Application {

	public static void main(String[] args) {
		SpringApplication.run(D6Application.class, args);
	}
}
