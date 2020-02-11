import java.util.Scanner;
public class FunctionExample3 {
    /* 예제: 전달받은 문자열의 마지막 단어 찾기 */
    // test
    public static char function (String input) {
        return input.charAt(input.length() - 1);
        // 배열에서의 길이는 .length, 문자열에서의 길이는 .length()를 써야한다.
        // 예제에서의 char 함수: charAt 에서 전달받은 인덱스 (input.length() - 1) 를 바탕으로 input에서 해당 문자가 무엇인지 찾아준다.
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 문자열을 입력하세요: ");
        String input = sc.nextLine();
        System.out.println(input + "의 마지막 단어는 " + function(input) + "입니다.");
    }
}
