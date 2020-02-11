import java.util.Scanner;
public class Factorial {

    // 반복 함수
//    public static int factorial (int number) {
//        int sum = 1;
//        for (int i = 2; i <= number; i++) {
//            sum *= i;
//        }
//        return sum;
//    }

    // 재귀 함수
    public static int factorial (int number) {
        if (number == 1)
            return 1;

        else
            return number * factorial(number - 1);
    }

    public static void main (String[] args) {
        System.out.print("팩토리얼을 구하려는 숫자를 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + "의 팩토리얼은 " + factorial(num) + " 입니다.");
    }
}
