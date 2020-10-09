package Adapter.classUse;

public class BplayerImpl implements Bplayer {
    @Override
    public void playFile(String fileName) {
        System.out.println("B Player Start :" + fileName);
    }

    @Override
    public void stop() {

    }
}
