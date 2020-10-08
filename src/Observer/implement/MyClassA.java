package Observer.implement;

public class MyClassA implements Observer {

    private boolean play;
    Publisher observable;

    @Override
    public void update(boolean play) {
        this.play = play;
        myActControl();
    }

    public void myActControl() {
        if (play)
            System.out.println("My Class A Start");
        else
            System.out.println("My Calss A Stop");
    }

    public MyClassA(Publisher o) {
        /*
            느슨한 결합을 위한 DependencyInjection
         */
        this.observable = o;
        observable.addObserver(this);
    }
}
