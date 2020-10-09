package Adapter.classUse;

public class AplayerImpl implements Aplayer {
    @Override
    public void play(String fileName) {
        System.out.println("A Player start :" + fileName);
    }

    @Override
    public void stop() {

    }
}
