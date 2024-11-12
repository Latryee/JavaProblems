package labquestions;
import java.util.Scanner;
public class Q24 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int N = input.nextInt();
        int sum = 0;
        for(int i= 1; i<N; i++){
        if(N % i == 0){
            sum+=i;
        }
        }
        if (sum == N){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    
    }
}
