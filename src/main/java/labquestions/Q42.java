package labquestions;

public class Q42 {
    public static void main(String[] args) {
        int[] shuffle = {0,2,3,7,1,2,5,9,8,6};
        System.out.println("Array before shuffle: ");
        for (int i = 0; i < shuffle.length; i++) {
            System.out.print(shuffle[i] + " ");
        }
        System.out.println("\nArray after shuffle: ");
        for(int i = shuffle.length - 1; i >= 0; i--) {
            int randomind = (int) (Math.random() *  (i-1));
            int temp = shuffle[i];
            shuffle[i] = shuffle[randomind];
            shuffle[randomind] = temp;
            System.out.print(shuffle[i] + " ");
        }
    }
}