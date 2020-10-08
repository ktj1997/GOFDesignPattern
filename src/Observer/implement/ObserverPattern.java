package Observer.implement;

public class ObserverPattern {
    /*
        자바 내장 옵저버패턴의 단점과 한계
        (1) Observable은 클래스이기 때문에, 서브클래스를 만들어야한다는 단점이 있다.
        이미 다른 클래스를 상속받고있는 상태라면, 해당 클래스는 Observable을 상속받지 못한다.

        (2) Observable클래스의 핵심 메소드를 외부에서 호출 할 수 없다.
        setChanged() 가 protected로 선언되어있다.
        Observable의 서브 클래스들만 setChanged( )를 호출 할 수 있고,
        결국 상속이외에 인스턴스 변수로서의 활용도 불가능하다.

        즉, 내장이 아닌 직접 옵저버패턴을 구현할 때는 인터페이스를 사용한다.
     */
    public static void main(String args[]) {
        PlayController playController = new PlayController();
        Observer myClassA = new MyClassA(playController);

        System.out.println("PlayController Start");
        playController.setFlag(true);

        System.out.println("PlayController Stop");
        playController.setFlag(false);
    }
    /*
        버튼의 클릭과 같은 이벤트가 바로 Observar패턴의 적용의 예이다.
     */
}
