package javaproblem;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class KelimeTahminOyunu {



        public static void main(String[] args) {
            String kelime = "MEMO";
            List<Character> tahminler = new ArrayList<>();
            int hak = 6;

            Scanner scanner = new Scanner(System.in);

            while (hak > 0) {
                System.out.print("Tahmin ettiğiniz kelime: ");
                for (char c : kelime.toCharArray()) {
                    if (tahminler.contains(c)) {
                        System.out.print(c + " ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();

                System.out.print("Bir harf tahmin edin: ");
                char tahmin = scanner.next().toUpperCase().charAt(0);

                if (tahminler.contains(tahmin)) {
                    System.out.println("Bu harfi zaten tahmin ettiniz.");
                    continue;
                }

                tahminler.add(tahmin);

                if (!kelime.contains(String.valueOf(tahmin))) {
                    hak--;
                    System.out.println("Yanlış tahmin! Kalan hak: " + hak);
                }

                if (tahminler.containsAll(List.of('M', 'E', 'O'))) {
                    System.out.println("Tebrikler! Kelimeyi bildiniz: " + kelime);
                    break;
                }
            }

            if (hak == 0) {
                System.out.println("Kaybettiniz! Doğru kelime: " + kelime);
            }

            scanner.close();
        }
    }

