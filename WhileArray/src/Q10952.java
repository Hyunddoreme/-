import java.util.Scanner;

public class Q10952 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int i = 0;


        while (i >= 0) {
            int A = L.nextInt();
            int B = L.nextInt();

            if (A + B == 0) {
                break;
            }

            System.out.println(A + B);
            i++;
        }
    }
}
