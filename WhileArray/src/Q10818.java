import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int l = L.nextInt();                         // l = length

        int[] arr = new int[l];                    // 배열 크기  arr=just name

        for (int i = 0; i < l; i++) {
            int n = L.nextInt();
            arr[i] = n;
        }                                           // 배열에 숫자 입력

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min + max);
    }
}
