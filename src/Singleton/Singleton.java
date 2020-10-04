package Singleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton {
    /*
        객체가 너무많아지면 컴퓨터자원을 과도하게 사용하게됨 -->이는 프로그램의 퍼포먼스를 저하시킨다.
        개발자는 최대객체의 갯수를 조절 해야만한다.(생성 하는 쪽에서 관리하는 것이지, 요구하는쪽은 신경 쓸 필요가 없다)

     */
    public static int num = 0;

    public static void main(String[] args) {
        /*Runnable task = () -> {
            try {
                num++;
                Database db = Database.getInstance(num + "번 째 DB");
                System.out.println(db.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
            /*
                for문은 엄청빠르다.
                즉 null
             */
        Runnable task = () -> {
            try {
                LogWritter log = LogWritter.getInstance();
                log.log("hello");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}

