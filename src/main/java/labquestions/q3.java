package labquestions;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // price=cost+cost*tax;-->price=cost(1+0.18)--->price=cost*1.18;-->cost=price/1.18
        System.out.println("Enter the price of the product: ");
        double price = input.nextDouble();
        //double cost= price/1.18;
        System.out.println(price / 1.18);
    }

}
