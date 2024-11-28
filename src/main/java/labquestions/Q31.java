
public class Q31 {
    public static void displaystars(int empty1, int star1, int empty2, int star2) {
        while(empty1>0){
            System.out.print(" ");
            empty1 = empty1-1;
        }
        while(star1>0){
            System.out.print("*");
            star1 = star1-1;
            if (star1==0){
                System.out.println("");
            }
        }
        
        while(empty2>0){
            System.out.print(" ");
            empty2 = empty2-1;
            
        }
        while(star2>0){
            System.out.print("*");
            star2 = star2 - 1;
        }
    }
    public static void main(String[] args) {
        int e1 = 5;
        int s1 = 10;
        int e2 = 8;
        int s2 = 3;
        displaystars(e1,s1,e2,s2);
    }
    
}
