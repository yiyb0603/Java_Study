public class ArrayExample3 {
    /* 예제: 길이가 50인 2차원 배열에 랜덤한 정수 값을 넣어주고 그 값을 분석하기 */
    public static void main(String[] args) {
        final int N = 50;
        int[][] arr = new int[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
