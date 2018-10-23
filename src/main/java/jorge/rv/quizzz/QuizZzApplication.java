package jorge.rv.quizzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "jorge.rv.quizzz")
public class QuizZzApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuizZzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
