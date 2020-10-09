package Adapter.classUse;

public class BtoAAdapter extends BplayerImpl implements Aplayer {

    @Override
    public void play(String fileName) {
        System.out.println("Player Start");
        playFile(fileName);
    }

    @Override
    public void stop() {

    }

    /*
        다중 상속을 흉내낸다.
     */
}
