abstract class Player {
    abstract void play (String songName);
    abstract void pause();
    abstract void stop();
}

public class AbstractExample1 extends Player {
    public static void main(String[] args) {
        AbstractExample1 main = new AbstractExample1();
        main.play("창모 - BAND");
    }

    @Override
    void play(String songName) {
        System.out.println(songName + " 곡을 재생합니다.");
    }

    @Override
    void pause() {
        System.out.println("곡을 일시정지 합니다.");
    }

    @Override
    void stop() {
        System.out.println("곡을 정지합니다.");
    }
}
