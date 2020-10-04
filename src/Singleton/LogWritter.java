package Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LogWritter {
    private static LogWritter logWritter = new LogWritter();
    private static BufferedWriter bw;

    private LogWritter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogWritter getInstance() {
        return logWritter;
    }

    //synchronized이기 때문에, 쓰레드가 동시에접속해도, 내용이 정상저장된다.
    public synchronized void log(String str) {
        try {
            bw.write(LocalDate.now() + ": " + Thread.currentThread().getName() + str + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        bw.close();
    }
}
