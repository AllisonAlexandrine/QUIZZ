package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityManagerApplication implements CommandLineRunner {
	

	@Autowired
	private JoueursRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityManagerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
	
	
}