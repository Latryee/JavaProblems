package javaproblem;
import java.util.Scanner;
public class SalaryTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        double tax =1;
        if(1000<= salary && salary<=4000){
            tax = (salary * 0.1);
            System.out.println("Your tax is: " + tax);


        }
        else if(4000<= salary && salary<=7000){
            tax = (salary * 0.2);
            System.out.println("Your tax is: " + tax);





        }
        else if(7000<= salary && salary<=10000){
            tax = (salary * 0.3);
            System.out.println("Your tax is: " + tax);

        }
        else if(10000<= salary || salary<=1000){
            System.out.println("İnvalid İnput");
        }
    }
}
