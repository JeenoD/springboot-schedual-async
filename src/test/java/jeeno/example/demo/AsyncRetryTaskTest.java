package jeeno.example.demo;

import jeeno.example.demo.async.MyAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/8 0008 21:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSchedualAsyncApplication.class)
public class AsyncRetryTaskTest {

    @Resource
    private MyAsyncTask task;

    @Test
    public void asyncRetryTaskTest() throws Exception{
        task.asyncRetryTask();
        // sleep 20s, waiting for the task finished.
        Thread.sleep(20000);
    }
}
