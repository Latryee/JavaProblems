package javaproblem;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BelgeSorgulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Dönem Karne Notunuzu Giriniz:");

        double not1 = input.nextDouble();

        if (not1 > 100) {
            System.out.println("Karne Notu 100den Fazla Olamaz Doğru Karne Notunuzla Tekrar Deneyiniz.");
            return;
        }


        System.out.println("2.Dönem Karne Notunuzu Giriniz:");
        double not2 = input.nextDouble();

        if (not2 > 100) { System.out.println("Karne Notu 100den Fazla Olamaz Doğru Karne Notunuzla Tekrar Deneyiniz.1");
            return;
        }

        double karnenotu = (not1 + not2) / 2;


        if (karnenotu < 75) {

            System.out.println("Belge almaya hak kazanamadınız, Notunuz: " + karnenotu);

        }

        else if (karnenotu < 85) {

            System.out.println("Teşekkür Belgesi almaya hak kazandınız, Notunuz: " + karnenotu);

        }

        else if (karnenotu < 100 ) {

            System.out.println("Takdir Belgesi almaya hak kazandınız, Notunuz: " + karnenotu);

        }

        //Hic yardım almadan yaptığım ilk projem



    }
}