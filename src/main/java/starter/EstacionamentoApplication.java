package starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"starter", "Controllers"})
public class EstacionamentoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EstacionamentoApplication.class, args);
    }
}