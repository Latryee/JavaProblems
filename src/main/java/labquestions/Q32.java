import java.util.Scanner;

public class Q32 {

    public static void rectangle(int M, int N) {
        for (int i = 0; i < M; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 0; j < N - 2; j++) {
            System.out.print("*");
            for (int k = 0; k < M - 2; k++) {
                System.out.print(" ");
            }
            if (M > 1) System.out.print("*");
            System.out.println();
        }

        if (N > 1) {
            for (int i = 0; i < M; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a M value: ");
        int m = input.nextInt();
        System.out.println("Enter a N value: ");
        int n = input.nextInt();

        rectangle(m, n);

        
    }
}
