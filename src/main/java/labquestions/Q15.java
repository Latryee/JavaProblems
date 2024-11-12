import java.util.Scanner;
public class Q15 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int n1 = input.nextInt();
        
        if (n1 % 2 == 0){
          System.out.println("Your value is even.");  
        
    }
        else if (n1 % 2 == 1){
            System.out.println("Your value is odd.");
        }
        else  {
            System.out.println("Invalid value");
    }
    }
}

    

