package github.codingShuttle.Springboot_Homework_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHomework1Application implements CommandLineRunner {

	@Autowired
	CakeBaker bakeCake;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHomework1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bakeCake.bakeCake();
	}
}
