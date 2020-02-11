import java.util.Scanner;

public class gradecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 :");
        int score = sc.nextInt();

        if (score >= 90)
            System.out.println("A+입니다.");
        else if (score >= 80)
            System.out.println("B+입니다.");
        else if (score >= 70)
            System.out.println("C+입니다.");
        else
            System.out.println("F입니다.");
    }
}
