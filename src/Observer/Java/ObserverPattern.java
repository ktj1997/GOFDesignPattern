package Observer.Java;

public class ObserverPattern {
    /*
        한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이가고, 자동으로 내용이 갱신 되는 방식 (One-To-Many)
        Java에서 많이 사용되기 때문에, 내장 옵저버 패턴이 존재한다.
     */
    public static void main(String[] args) {
        PlayController playController = new PlayController();
        MyClassA myClassA = new MyClassA(playController);

        System.out.println("playerController Start");
        playController.setFlag(true);

        System.out.println("PlayerController Stop");
        playController.setFlag(false);
    }
}
