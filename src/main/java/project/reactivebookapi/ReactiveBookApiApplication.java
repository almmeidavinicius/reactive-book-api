package project.reactivebookapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class ReactiveBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveBookApiApplication.class, args);
	}

}
