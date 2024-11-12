package javaproblem;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MiniAtm {
    public static void main(String[] args) {

        System.out.println("Atm'ye hoş geldiniz.");
        System.out.println("Bakiyenizi görmek için 1yi tıklayınız.");
        System.out.println("Para çekmek için 2yi tıklayınız.");
        System.out.println("Para yatırmak için 3ü tıklayınız.");
        System.out.println("Cıkış yapmak için 4ü tıklayınız.");
        Scanner input = new Scanner(System.in);
        double bakiye = 1500;

        int secim = input.nextInt();
        while (4 >= secim) {


            if (secim == 1) {
                System.out.println("Bakiyeniz " + bakiye + " Tl dir.");
                System.out.println("İşlem yapmak için yeniden giriş yapınız.");
                break;

            }

            if (secim == 2) {
                System.out.println("Para çekmek istediğiniz miktarı giriniz: ");
                int cekmekistenen = input.nextInt();
                if (cekmekistenen > bakiye) {
                    System.out.println("Bakiyeniz yetersizdir.");
                    return;
                }
                else {
                    System.out.println("Çektiğiniz miktar= " + cekmekistenen + "Kalan bakiyeniz= " + (bakiye - cekmekistenen));
                }

            }

            if (secim == 3) {
                System.out.println("Yatırmak istediğiniz para miktarını giriniz");
                int yatirmakistenen = input.nextInt();
                System.out.println("Yatırdığınız miktar: " + yatirmakistenen + "Tl" + " Son durumda bakiyeniz: " + (bakiye + yatirmakistenen) + "Tl");
            }
            if (secim >= 4) {
                System.out.println("Hesabınızdan cıkış yapılmıştır, İyi günler dileriz.");
                return;

            }
        }
        if (secim > 4) {
            System.out.println("Hesabınızdan cıkış yapılmıştır, İyi günler dileriz.");
        }
    }
}