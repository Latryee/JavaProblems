package javaproblem;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
       String[][] sehirler = new String[3][3];
       sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Rize";
        sehirler[1][1] = "Trabzon";
        sehirler[1][2] = "Artvin";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Sivas";
        sehirler[2][2] = "Konya";

        for(int i = 0; i < sehirler.length; i++) {
            System.out.println("-----------------------");
            for(int j = 0; j < sehirler[i].length; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
