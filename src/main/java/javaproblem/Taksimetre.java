package javaproblem;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gittiğinizi giriniz:");
        double km = input.nextDouble();
        double fiyat = 24.55 + (km * 17.62);
        if (fiyat < 90) fiyat =90;
        System.out.println("Yol Ücretiniz: " + fiyat);

        //Bucuklu sayılar nedense calışmadı sonradan incele
    }
}
