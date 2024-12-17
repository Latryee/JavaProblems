package javaproblem;

public class CopyArray {
    public static void main(String[] args) {
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        list1[0] = 1;
        list1[1] = 2;
        list1[2] = 3;
        list1[3] = 4;
            for (int i = 0; i < list1.length; i++) {

                list2[i] = list1[i];
                System.out.println(list2[i] + " " + list1[i]);
            }



    }


}
