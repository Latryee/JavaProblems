package javaproblem;
import java.util.Scanner;
public class MiniAtm2 {
    public static void main(String[] args) {

        double bakiye = 30000;
        while (true) {
            System.out.println("Atm'ye hoş geldiniz.");
            System.out.println("Bakiyenizi görmek için 1yi tıklayınız.");
            System.out.println("Para çekmek için 2yi tıklayınız.");
            System.out.println("Para yatırmak için 3ü tıklayınız.");
            System.out.println("Cıkış yapmak için 4ü tıklayınız.");
            Scanner input = new Scanner(System.in);


            int secim = input.nextInt();

            if (secim == 1) {
                System.out.println("Bakiyeniz " + bakiye + " Tl dir.");
                System.out.println("Ana ekrana gelmek için lütfen 4e tıklayın");
                if (input.nextInt() == 4) {
                    System.out.println("Ana ekrana dönülüyor...");

                    // Buraya illa gerek yok ağır kaçtı
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(" ");
                System.out.println(" ");
            }

            if (secim == 2) {
                System.out.println("Para çekmek istediğiniz miktarı giriniz: ");
                int cekmekistenen = input.nextInt();
                if (cekmekistenen > bakiye) {
                    System.out.println("Bakiyeniz yetersizdir.");
                }
                else {
                    System.out.println("Çektiğiniz miktar= " + cekmekistenen +" "+ "Kalan bakiyeniz= " + (bakiye - cekmekistenen));
                    bakiye -=cekmekistenen;
                }
                System.out.println(" ");
                System.out.println(" ");
            }

            if (secim == 3) {
                System.out.println("Yatırmak istediğiniz para miktarını giriniz");
                int yatirmakistenen = input.nextInt();
                System.out.println("Yatırdığınız miktar: " + yatirmakistenen + "Tl" + " Son durumda bakiyeniz: " + (bakiye + yatirmakistenen) + "Tl");
                bakiye += yatirmakistenen;
                System.out.println(" ");
                System.out.println(" ");

            }
            if (secim >= 4) {
                System.out.println("Hesabınızdan cıkış yapılmıştır, İyi günler dileriz.");
                break;

            }

            if (secim > 4) {
                System.out.println("Hesabınızdan cıkış yapılmıştır, İyi günler dileriz.");
            }
        }
    }
}


