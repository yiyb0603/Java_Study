import java.util.Scanner;

class Fruit {
    String name;
    int price;
    int fresh;

    public void show() {
        System.out.println("이름: " + name);
        System.out.println("가격: " + price);
        System.out.println("신선도: " + fresh);
    }
}

class Peach extends Fruit {
    public Peach() {
        price = 1500;
        name = "복숭아";
        fresh = 75;
    }
}

class Banana extends Fruit {
    public Banana() {
        price = 1000;
        name = "바나나";
        fresh = 80;
    }
}

public class PolymorphismExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit fruit;
        System.out.println("바나나: 1");
        System.out.println("복숭아: 2");
        System.out.print("원하는 번호를 입력하세요 :");
        int input = sc.nextInt();
        if (input == 1) {
            fruit = new Banana();
            fruit.show();
        }

        else if (input == 2) {
            fruit = new Peach();
            fruit.show();
        }

        else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
