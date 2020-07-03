import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class Main {

    public static void main(String args[]) throws IOException {

        ScheduledExecutorService interval = Executors.newScheduledThreadPool(1);

        interval.scheduleAtFixedRate(
          new Runnable() {
              public void run() {
                  System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
              }
        }, 1000, 1000, TimeUnit.MILLISECONDS);
    }
}