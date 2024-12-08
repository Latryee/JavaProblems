package javaproblem;

public class MiniProje3 {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
        int aranacak = 5;
        boolean varise = false;
        for(int sayi : sayilar){
           if(sayi == aranacak){
               varise = true;
               break;

           }
        }
        System.out.println(varise);
    }
}
