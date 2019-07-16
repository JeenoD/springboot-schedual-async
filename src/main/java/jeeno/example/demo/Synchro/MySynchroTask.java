package jeeno.example.demo.Synchro;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 10:48
 */
@Component
public class MySynchroTask {
    public static Random random =new Random();

    public void synchroTaskOne() throws Exception {
        System.out.println("this is the 1st task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        System.out.println("1st task finished, it takes：" + (end - start) + " (ms)");
    }

    public void synchroTaskTwo() throws Exception {
        System.out.println("this is the 2nd task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        System.out.println("2nd task finished, it takes：" + (end - start) + " (ms)");
    }

    public void synchroTaskThree() throws Exception {
        System.out.println("this is the 3rd task.");
        long start = System.currentTimeMillis();
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        System.out.println("3rd task finished, it takes：" + (end - start) + " (ms)");
    }
}
