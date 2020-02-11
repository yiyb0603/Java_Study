import java.util.Scanner;
public class RightTriangle {
    // 삼각형을 출력하는 예제
    // test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 삼각형 길이를 입력해주세요 :");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
