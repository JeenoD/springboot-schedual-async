package jeeno.example.demo;


import jeeno.example.demo.async.MyAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 10:50
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AsyncTaskTest {

    @Autowired
    private MyAsyncTask task;

    @Test
    public void MyAsyncTaskTest() throws Exception {
        task.asyncTaskOne();
        task.asyncTaskTwo();
        task.asyncTaskThree();
    }

    @Test
    public void AsyncTaskWithCallbackTest() throws Exception {
        Future<String> four = task.asyncTaskFour();
        Future<String> five = task.asyncTaskFive();
        while(true){
            // only when 4th and 5th tasks all finished, stop the loop.
            if(four.isDone() && five.isDone()){
                break;
            }
            System.out.println("processing...");
        }
        System.out.println("tasks all done.");
    }

    @Test
    public void TimerTaskTest() throws Exception {
        Future<String> futureResult = task.timerTask();
        // 5s is the setted timeout. if the task didnt finish in 5s, it would throw java.util.concurrent.TimeoutException,
        // and turn back the thread without blocking.
        String result = futureResult.get(5, TimeUnit.SECONDS);
        log.info("Test: " + result);
    }

}
