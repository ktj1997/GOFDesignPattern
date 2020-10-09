package Adapter.instance;

public class Adapter {
    /*
        Adapter패턴은 Wrapper패턴으로 불리기도 한다.
        이미 제공되어있는 것과, 필요한 것 사이의 차이를 없애주는게 Adapter패턴이다.
        이미 있는 것(안정화 되어있는 것)을 기반으로 Needs에 맞게 바꾼다.

        구현은 두가지의 종류가있다.
        1)클래스에 의한 Adapter패턴(상속을 사용한 Adapter패턴)
        2)인스턴스에 의한 Adapter패턴(위임을 사용한 Adapter패턴)
     */
    public static void main(String[] args) {
        Aplayer player1 = new AplayerImpl();

        player1.play("aaa.mp3");
        //어떠한 이유로 더이상 Aplayer를 사용 할 수 없게되고, 다른 걸 사용해야 한다.

        /*
            기존의 코드는 다 Aplayer 기반으로 사용 되고있다.
            Aplyer obj = new BplayerImpl( ); 이런식으로 사용하고 싶은 것이다.
         */
        player1 = new BtoAAdapter(new BplayerImpl());
        player1.play("aaa.mp3");

    }
}
