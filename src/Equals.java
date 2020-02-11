public class Equals {
    public static void main(String[] args) {
        String a = "Man";
        int b = 0;

        // 자바는 String을 비교할때 equals()를 이용합니다.
        // 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.

        if (a.equals("Man")) {
            System.out.println("남자입니다.");
        }

        else {
            System.out.println("남자가 아닙니다sss.");
        }

        if (b == 3) {
            System.out.println("b는 3입니다.");
        }

        else {
            System.out.println("b는 3이 아닙니다.");
        }

        if (a.equalsIgnoreCase("man")) { // equalsIgnoreCase: 대소문자를 구별하지 않고 해당 문자가 들어있는지를 판단한다.
            System.out.println("이것또한 남자입니다.");
        }
    }
}
