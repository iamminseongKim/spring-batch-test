package hello.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(ExampleApplication.class, args)));
	}

}
