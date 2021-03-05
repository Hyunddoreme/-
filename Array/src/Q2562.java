import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int input = L.nextInt();

        int[] arr  = new int [input];

        for(int i = 0 ; i < input ; i++){
            int a = L.nextInt();
            arr[i] = a;
        }

        int Max = arr[0];
        int Min = arr[0];

        int i = 0;

        while(i < input){
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
