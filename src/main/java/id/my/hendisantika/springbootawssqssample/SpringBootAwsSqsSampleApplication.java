package id.my.hendisantika.springbootawssqssample;

import id.my.hendisantika.springbootawssqssample.config.Publisher;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootAwsSqsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsSqsSampleApplication.class, args);
    }


    @Bean
    public ApplicationRunner runner(Publisher publisher) {
        return args -> {
            Thread.sleep(10000);
            for (int i = 0; i < 10; i++) {
                publisher.publishMessage(String.valueOf(i));
            }
        };
    }
}
