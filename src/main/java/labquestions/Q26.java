import java.util.Scanner;
public class Q26 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a M value");
        int m = input.nextInt();
        System.out.println("Enter a N value");
        int n = input.nextInt();
            
        for(int i= 0; i<m; i++){
            if(i == 0 || i == m - 1){
                for (int j = 0; j<n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j =0; j<n-1; j++){
                    System.out.print(" ");
                }
                if(n>1){
                    System.out.println("*");
                }
            }
            
            
        }
        
        
        
        
        
        
    }
}
