package starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import out.service.OutCreatClient;

@Configuration
public class AppConfig {

    @Bean
    public OutCreatClient clientService() {
        return new OutCreatClient();
    }

}