package com.ftechiz.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtechizApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtechizApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initData(ContactRepository contactRepository) {
//		return args -> {
//			Address address1 = new Address();
//			address1.setAddressLine1("123 Main St");
//			address1.setAddressLine2("Apt 4");
//			address1.setCity("Anytown");
//			address1.setPostalCode("12345");
//
//			Contact contact1 = new Contact();
//			contact1.setFullName("John Doe");
//			contact1.setDateOfBirth(LocalDate.of(1980, 1, 1));
//			contact1.setAddress(address1);
//
//			contactRepository.save(contact1);
//		};
//	}

}
