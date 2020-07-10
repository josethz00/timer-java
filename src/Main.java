import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class Main {

    public static void main(String args[]) throws IOException, InterruptedException {
        TimeUnit time = TimeUnit.SECONDS;
        
        for(;;) {
        	time.sleep(1L);
        	System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }
}
