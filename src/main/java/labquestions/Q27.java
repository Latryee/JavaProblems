import java.util.Scanner;
public class Q27 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        int N = input.nextInt();
       
        int count = 0;
                while(N>0){

             int sum = 0;
        for(int i=1; i<N; i++){
            if(N % i == 0){
            sum+=i;
        }
        }
        if (sum == N){
            count++;
        }
            
        
        
        N=N-1;
    }
        System.out.println("Count of Perfect Number is: " + count);
        
    }
}
