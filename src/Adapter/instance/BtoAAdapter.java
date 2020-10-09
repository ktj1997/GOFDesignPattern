package Adapter.instance;

public class BtoAAdapter implements Aplayer {

    private Bplayer media;

    @Override
    public void play(String fileName) {
        System.out.println("Player Start");
        media.playFile(fileName);
    }

    @Override
    public void stop() {

    }

    public BtoAAdapter(Bplayer b) {
        this.media = b;
    }
    /*
        기존 코드에서 수정해야 할 노력과 분량을 어댑터클래스 생성에 사용
        기존에 잘 사용되던 코드를 건드리지 않기 때문에,
        새롭게 나타나는 에러는 어댑터클래스만 확인하면 됨
     */
}
