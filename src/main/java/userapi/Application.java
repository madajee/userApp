package userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
        log.info("********Start Logging From Main Method******");
        log.info("********Hello Spring Boot Seed******");
        log.info("********End Logging From Main Method********");
    }

    @Bean
    public CommandLineRunner run() throws Exception {
    	log.info("********In Command Line Runner******");
    	return null;
    }

    public String convertToUpperCase (String str){
 	   return str.toUpperCase();
	}
}