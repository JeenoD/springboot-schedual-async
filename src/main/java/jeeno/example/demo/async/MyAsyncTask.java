package jeeno.example.demo.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 10:44
 */
@Component
@Slf4j
public class MyAsyncTask {

    @Async("Executor")
    public void asyncTaskOne() throws Exception {
        log.info("this is the 1st task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        log.info("1st task finished, it takes：" + (end - start) + " (ms)");
    }

    @Async("Executor")
    public void asyncTaskTwo() throws Exception {
        log.info("this is the 2nd task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        log.info("2nd task finished, it takes：" + (end - start) + " (ms)");
    }

    @Async("Executor")
    public void asyncTaskThree() throws Exception {
        log.info("this is the 3rd task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        log.info("3rd task finished, it takes：" + (end - start) + " (ms)");
    }

    @Async
    public Future<String> asyncTaskFour() throws Exception {
        log.info("this is the 4th task.");
        Thread.sleep(10000);
        return new AsyncResult<>("4th task finished.");
    }

    @Async
    public Future<String> asyncTaskFive() throws Exception {
        log.info("this is the 5th task.");
        Thread.sleep(10000);
        return new AsyncResult<>("5th task finished.");
    }

    @Async("Executor")
    public Future<String> timerTask() throws Exception {
        long sleep = 10000;
        log.info("start the timerTask，it would take " + sleep + "(ms)");
        Thread.sleep(sleep);
        log.info("timerTask finished.");
        return new AsyncResult<>("timerTask finished.");
    }
}
