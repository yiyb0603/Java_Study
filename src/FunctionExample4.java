public class FunctionExample4 {
    /* 예제: 모듈화를 이용한 전달받은 숫자들중 최댓값 찾기 */
    // test
    public static int max (int a, int b) {
        return (a > b) ? a : b;
        // 삼항연산자 구조: 조건 ? (참일경우 실행) : (거짓일경우 실행);
    }

    public static int function (int a, int b, int c) {
        int result = max(a, b);
        result = max(result, c);
        return result;
    }

    public static void main (String[] args) {
        System.out.println("(345, 567, 789) 중에서 가장 큰 값은 " + function(345, 567, 789));
    }
}
