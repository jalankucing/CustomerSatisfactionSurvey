package id.co.mii.serverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerappApplication.class, args);

		System.out.println("----------------------------------");
		System.out.println("Server-App is Running . . .");
		System.out.println("----------------------------------");
	}

}
