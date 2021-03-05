import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int input = L.nextInt();
        int i = 0;

        int result = 0;

        int temp = A;

        while (true){
            int a = A / 10;
            int b = A % 10;
            int c = (a+b) % 10;
            int newNum = b*10 + c;


            if (A == temp) {
                break;
            }
            i++;
            result++;
        }
        System.out.print(result);
    }
}

/*
26 => 2+6=8 > 6+8=14 > 8+4=12 > 4+2=6 !!!!! 이런식
 */
