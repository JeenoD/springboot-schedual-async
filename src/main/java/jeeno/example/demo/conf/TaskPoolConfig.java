package jeeno.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * the configuration of task pool
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 11:31
 */
@Configuration
public class TaskPoolConfig {
    @Bean("Executor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // initialized size of thread pool
        executor.setCorePoolSize(10);
        // max size of thread pool
        executor.setMaxPoolSize(20);
        // the max capacity of queue waiting for processing
        executor.setQueueCapacity(200);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix("TaskThread-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60);
        return executor;
    }
}
