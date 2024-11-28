import java.util.Scanner;
public class Q30 {
    public static int displaystars(int x , int y) {
        while(x>0){
            System.out.println("                            ");
            x = x -1;
        }
        
        while(y>0){
            System.out.println("****************************");
            y = y - 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a empty space value:  ");
        int space = input.nextInt();
        System.out.println("Enter a star value: ");
        int stars = input.nextInt();
         displaystars(space,stars);
    }
}
