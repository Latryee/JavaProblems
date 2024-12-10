package javaproblem;



public class DefaultValueInArray {
    public static void main(String[] args) {
        int[] ageList = new int[7];
        ageList[0] = 35;
        ageList[1] = 15;
        ageList[2] = ageList[0] + ageList[1];
        printArray(ageList);

        double[] scoreList = new double[50];
        scoreList[scoreList.length - 1] = 100;
        printArray(scoreList);

        char[] letterList = new char[26];
        letterList[0] = 'a';
        printArray(letterList);

        boolean[] checkList = new boolean[10];
        checkList[0] = true;
        printArray(checkList);

        String[] cityList = new String[5];
        cityList[0] = "Ankara";
        for (int i = 0; i < cityList.length - 1; i++) {
            System.out.println(cityList[i]);
        }

        double[] myList = {1.9, 2.9, 3.4, 3.5};
        System.out.println("myList.length: " + myList.length);
        System.out.println("myList: " + myList);
        printArray(myList);
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void printArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void printArray(char[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void printArray(boolean[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

