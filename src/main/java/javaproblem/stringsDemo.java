package javaproblem;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " +  mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
       //  0 dan başladığı için 5. eleman için 4 yazdık.
        System.out.println(mesaj.concat(" Yaşasın!"));
        // concat birleştirme anlamına gelir ve burda mesajları birleştirdik.
        System.out.println(mesaj.startsWith("B"));
        // başladığı harfe göre doğru yanlış verir B yazdığım icin true verdi
        System.out.println(mesaj.endsWith("."));
        // bittiği harrfe göre doğru yanlış verir boolean
        char[] karakterler = new char[6];
        mesaj.getChars(0,6,karakterler,0);
        System.out.println(karakterler);
       // charları alır ve başka bi yere aktarır.
        System.out.println(mesaj.indexOf("av"));
        // icine yazdıgımız sayının kacıncı sırada oldugunu gösterir
        System.out.println(mesaj.lastIndexOf("av"));
        // buda sağdan başlar yani tersten kontrol eder

        System.out.println(mesaj.replace( " ", "-"));
       // sadece bu kodun icinde metin değişti
        System.out.println(mesaj.substring(6,9));
       // bir aralık verip aradaki harfleri yazdırabilirsiniz alabilirsiniz.
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
       // mesajı belirlediğiniz harfe göre böler ve ayırır. örneğin boşluk yazınca her kelimeyi teker teker yazar.
        System.out.println(mesaj.toLowerCase());
        //harfleri küçük yazar
        System.out.println(mesaj.toUpperCase());
        // harfleri büyütür


    }
}
