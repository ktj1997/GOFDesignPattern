package Observer.Java;

import java.util.Observable;

/*
    Subject 객체는 따로 구현해줘야 하는 것은 없고,
    Observable 클래스를 상속받고, 자기 할일을 한다음,
    값의 변경을 알려주기만 하면된다.
 */
public class PlayController extends Observable {
    private boolean bPlay;

    public void setFlag(boolean bPlay) {
        this.bPlay = bPlay;
        //값이 변경 되었음을 알림
        setChanged();
        notifyObservers();
    }

    public boolean getFlag() {
        return this.bPlay;
    }
}
