package labquestions;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total cost of the product: ");
        double cost = s.nextDouble();
        
        //price=cost+cost*0.18;-->price=cost*1.18;
        
        double price = cost * 1.18;
        System.out.println("Your total cost is:" + price);

    }
}
