public class FunctionExample1 {
    /* 예제: 세개의 수들의 최대공약수 구하기 */

                // 반환형, 함수명, 매개변수
    public static int function (int a, int b, int c) {
        int min;
        if (a > b) {
            if (b > c) {
                min = c;
            }

            else
            {
                min = b;
            }
        }

        else {
            if (a > c) {
                min = c;
            }

            else {
                min = a;
            }
        }

        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return i;
            }
        }
        return -1;
        // test
    }
    public static void main(String[] args) {
        System.out.println("(400, 300, 750)의 최대공약수: " + function(400, 300, 750));
    }
}
