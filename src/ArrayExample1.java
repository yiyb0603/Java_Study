import java.util.Scanner;
public class ArrayExample1 {

    public static int max (int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력하세요 :");
        int number = sc.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열에 입력할 정수를 입력하세요 :");
            arr[i] = sc.nextInt();
        }

        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            result = max(result, arr[i]);
        }

        System.out.println("입력한 모든 정수 중에서 가장 큰 값은 " + result + " 입니다.");
    }
}
