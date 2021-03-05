import java.util.Scanner;

public class Q2562_1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int[] arr = new int[9];

        int i = 0;

        while (i < arr.length) {
            int a = l.nextInt();
            arr[i] = a;
            i++;
        }                               // 숫자 입력 끝

        int Max = arr[0];
        i = 0;
        int maxindex = 1;

        while (i < arr.length) {
            if (Max < arr[i]) {
                Max = arr[i];
                maxindex= i+1;
            }
            i++;
        }
        System.out.println(Max);
        System.out.println(maxindex);
    }
}
