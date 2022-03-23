package com.datagen.aiven;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class AivenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AivenApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(KafkaTemplate<String, Object> template){
		return args -> {
			Message message1 = new Message("APPL", 179.00 , LocalDateTime.now());
			template.send("topic1", UUID.randomUUID().toString(), message1);
			Message message2 = new Message("WMT", 140.00, LocalDateTime.now());
			template.send("topic1", UUID.randomUUID().toString(), message2);
		};
	}
}
