package Singleton;

public class Database {
    //static변수의 특성을 이용, 미리만들어놓자.
    private static Database singleton = new Database("Init");
    private String name;

    /*
      synchronized를 사용 할 수도있다. 동시에 여러개의 쓰레드가 접근하더라도 순서를 지키기 때문
      만약, static변수를 초기화 하지않고, getInstance( )에서 초기화하면서,
      synchronized가 아니라면, 쓰레드 동시접근시에, 각자 객체를 생성해버린다.
      synchronized는 효율이 좋지않다.
     */
    public static Database getInstance(String name) {
        singleton.name = name;
        return singleton;
    }

    private Database(String name) {
        //생성자를 private로 만들어서 getInstance()메소드를 통해서 singleton객체만을 받을 수 있게하기.
        try {
            Thread.sleep(1000);
            this.name = name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return this.name;
    }
}
