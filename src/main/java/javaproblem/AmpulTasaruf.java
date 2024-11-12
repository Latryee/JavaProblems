package javaproblem;
import java.util.Scanner;

public class AmpulTasaruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double marka1 = 10;
        double marka2 = 25;
        double elektrikfiyat = 0.01;

        System.out.println("Ampül sayısını giriniz: ");
        double ampulsayi = input.nextDouble();

        System.out.println("Ampüllerin günde kaç saat kullanıldığını giriniz: ");
        double kullanimsaati = input.nextDouble();

        if ( kullanimsaati > 24 ) {
            System.out.println("Günlük kullanım saati 24'ten büyük olamaz.");
            return;
        }

        double marka1fiyat = (marka1 * elektrikfiyat * kullanimsaati * ampulsayi);
        double marka2fiyat = (marka2 * elektrikfiyat * kullanimsaati * ampulsayi);
        double tasaruf = marka2fiyat - marka1fiyat;
        System.out.println("Eğer 1. markayı kullanırsanız günlük : " + marka1fiyat + "TL " + " 2.markayı kullanırsanız: " + marka2fiyat + "TL");
        System.out.println("1.markayı kullanırsanız günlük tasarrufunuz : " + tasaruf + "TL");

    }
}
