package jeeno.example.demo;

import jeeno.example.demo.Synchro.MySynchroTask;
import jeeno.example.demo.async.MyAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 10:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringbootSchedualAsyncApplication.class})// 指定启动类
public class SynchroTaskTest {
    @Autowired
    private MySynchroTask task;

    @Test
    public void MyAsyncTaskTest() throws Exception {
        long start = System.currentTimeMillis();
        task.synchroTaskOne();
        task.synchroTaskTwo();
        task.synchroTaskThree();
        long end = System.currentTimeMillis();
        System.out.println("synchroTaskTest finished, it totally takes " + (end-start) + "(ms)");
    }
}
