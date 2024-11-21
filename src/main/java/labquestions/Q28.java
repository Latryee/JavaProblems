import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter (M) value: ");
        int M = scanner.nextInt();

        if (M < 3) {
            System.out.println("(M) value must be bigger than 3!");
            return;
        }

        for (int i = 0; i < M; i++) {
            if (i == 0 || i == M / 2 || i == M - 1) {
                for (int j = 0; j < M; j++) {
                    System.out.print("*");
                }
            } else {
            
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}
    

