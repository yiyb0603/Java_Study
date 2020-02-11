public class ArrayExample2 {
    public static void main (String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
            /* 1이상 101 미만까지의 정수를 랜덤으로 100번 넣어준다. */
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
    }
}
