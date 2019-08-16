package uk.gov.dwp.esbmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("uk.gov.dwp.esbmock.domain")
@EnableMongoRepositories("uk.gov.dwp.esbmock.repository")
public class EsbMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsbMockApplication.class, args);
	}
}
