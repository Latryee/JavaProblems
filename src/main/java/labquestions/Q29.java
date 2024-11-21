import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a (M) value: ");
        int M = input.nextInt();
        System.out.println("Enter a (N) value: ");
        int N = input.nextInt();
        
        for(int i = 1; i<M; i++){
            System.out.println("*");
        }
        for(int i =0; i<N; i++){
            System.out.print("*");
        }
    }
 
}
