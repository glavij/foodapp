package com.hamid.FoodApp;

import com.hamid.FoodApp.email_notification.dtos.NotificationDTO;
import com.hamid.FoodApp.email_notification.services.NotificationService;
import com.hamid.FoodApp.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FoodAppApplication {


//	private final  NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//
//			NotificationDTO notificationDTO = NotificationDTO.builder()
//					.recipient("h.moghadasinia@gmail.com")
//					.subject("Hello Test")
//					.body("It is test email")
//					.type(NotificationType.EMAIL)
//					.build();
//
//			notificationService.sendEmail(notificationDTO);
//		};
//
//	}
}
