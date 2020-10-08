package Observer.Java;

import java.util.Observable;
import java.util.Observer;

public class MyClassA implements Observer {

    Observable observable; //등록될 Observable
    private boolean bPlay;

    @Override
    public void update(Observable o, Object arg) {
        //Observable이 Observer객체의 Subject객체인지 확인
        if (o instanceof PlayController) {
            PlayController subject = (PlayController) o;
            this.bPlay = subject.getFlag();
            myActControl();
        }
    }

    public void myActControl() {
        if (bPlay)
            System.out.println("My Class A Start");
        else
            System.out.println("My Class A Stop");
    }

    public MyClassA(Observable o) {
        this.observable = o;
        observable.addObserver(this); //Subject클래스에 Observer로서 등록이 되게된다.
    }

}
