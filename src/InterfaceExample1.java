interface Dog {
    abstract void crying();
    public void show();
}

public class InterfaceExample1 implements Dog {
    // interface는 다중상속을 지원하지만, 추상메소드는 다중상속 지원을 x
    public static void main(String[] args) {
        InterfaceExample1 main = new InterfaceExample1();
        main.crying();
        main.show();
    }

    @Override
    public void crying() {
        System.out.println("월! 월!");
    }

    @Override
    public void show() {
        System.out.println("Hello World");
    }
}
