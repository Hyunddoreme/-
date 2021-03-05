import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int a = l.nextInt();
        int b = l.nextInt();
        int c = l.nextInt();

        int[] arr = new int[10];

        int w = a*b*c;

        int i = 0;
        while(w>0){
            i = w % 10;
            arr[i]++;
            w = w / 10;
        }
        int p=0;
        while(p<10){
            System.out.println(arr[p]);
            p++;
        }
    }
}
