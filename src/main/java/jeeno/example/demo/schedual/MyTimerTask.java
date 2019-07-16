package jeeno.example.demo.schedual;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Jeeno
 * @version: 0.0.1
 * @since: 2019/7/16 10:37
 */
@Component
public class MyTimerTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * fixedRate defines the time range(millisecond) since the beginning of last call
     * fixedDelay defines the time range(millisecond) since the ending of last call
     * initialDelay defines the time delay at the first call
     */
    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() {
        System.out.println("current time is " + dateFormat.format(new Date()));
    }

}
