package jeeno.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling   // enable the timer task.
@EnableAsync        // enable the async thread.
@EnableRetry        // enable the retry mechanism
public class SpringbootSchedualAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSchedualAsyncApplication.class, args);
    }

}
