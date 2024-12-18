package javaproblem;
import java.util.Scanner;
public class UsingStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Her Halini Görmek İçin Bir Yazı Yazın: ");
        String s = sc.nextLine();
        System.out.println("Normal hali: " + s);
        System.out.println("Büyük harfli hali: " + s.toUpperCase());
        System.out.println("Küçük harfli hali: " + s.toLowerCase());
        System.out.println("Uzunluğu : " + s.length());
        System.out.println("Yazdığınız yazının sectiğiniz basamağındaki harfi görüntülemek için sayı girin : ");
        int n = sc.nextInt();
        if(n>s.length()){
            System.out.println("Hatalı değer girdiniz");
        }
        else{
            System.out.println("Sectiğiniz basamak: "+n + " Sectiğiniz basamaktaki karakter: " + s.charAt(n));
        }
        System.out.println("Obez kelimesine eşit mi diye kontrol: " + s.equalsIgnoreCase("Obez"));
        System.out.println("İçinde a harfi soldan en yakın nerde var: " + s.indexOf('a'));
        System.out.println("İçinde a harfi sağdan en yakın nerede var: " + s.lastIndexOf( 'a'));
        System.out.println("Hangi harfle bittiğini kontrol eder: " + s.endsWith("a"));

    }
}
