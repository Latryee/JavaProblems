package labquestions;
import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        System.out.println("Enter a number(max 10 digits): ");
        int n = sc.nextInt();
        for(int i=0 ; i<number.length ; i++){
            number[i] = n%10;
            n =n/10;
            System.out.print(number[i] + " ");
            if(n==0){
                break;
            }
        }
    }
}
