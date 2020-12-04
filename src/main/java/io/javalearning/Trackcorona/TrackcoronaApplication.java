package io.javalearning.Trackcorona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrackcoronaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackcoronaApplication.class, args);
	}

}
