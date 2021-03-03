import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int p = L.nextInt();

        int[] arr  = new int [p];

        for(int i = 0 ; i < p ; i++){
            int a = L.nextInt();
            a = arr[i];
        }

        int Max = arr[0];
        int Min = arr[0];

        int i = 0;

        while(i < p){
            if(Min > arr[i]){
                Min = arr[i];
            }
            if(Max < arr[i]){
                Max = arr[i];
            }
            i++;
        }

        System.out.printf("%d %d", Min, Max);

    }
}
