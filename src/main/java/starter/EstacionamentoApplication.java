package starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"out.entity"})
public class EstacionamentoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EstacionamentoApplication.class, args);
    }
}