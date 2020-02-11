public class Contains {
    public static void main(String[] args) {
        String a = "I Love You";
        if (a.contains("Love")) {
            // a 문장이 "Love"를 포함하고 있을때 실행하는 문장
            System.out.println("Me too.");
        }

        else {
            // a 문장이 "Love"를 포함하고 있지 않을 때 실행하는 문장
            System.out.println("I Hate You.");
        }
    }
}
