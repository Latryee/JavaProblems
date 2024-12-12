package labquestions;
import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[100];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number(Enter 0 to close); ");
            numbers[i] = sc.nextInt();

          if(numbers[i]==0){
              System.out.println("System Closed");
              break;
          }
        }
        int max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){

                max = numbers[i];
            }

        }
        int min = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum number is "+max );
        System.out.println("Minimum number is "+min );
    }
}
