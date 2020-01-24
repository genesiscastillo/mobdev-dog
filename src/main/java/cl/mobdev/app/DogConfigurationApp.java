package cl.mobdev.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cl.mobdev")
public class DogConfigurationApp implements CommandLineRunner  {

	public static void main(String[] args) {
        SpringApplication.run(DogConfigurationApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			System.out.println("use http://localhost:8081/dog/hound");
	}
}
