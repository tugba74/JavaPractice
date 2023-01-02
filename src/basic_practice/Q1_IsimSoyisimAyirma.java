package basic_practice;

import java.util.Scanner;

public class Q1_IsimSoyisimAyirma {
    public static void main(String[] args) {
          /*Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
          ad ayrı soyad ayrı sekilde ekrana yazdırınız.

          input  : "AHMET YILMAZ"
          output : Ahmet
                   Yilmaz

     */
     // subString methodu uzerinde islem yapilan String'in istenen bir parcasini size gri dondurur
     // Bunu yaparken iki farkli olanak sunar:
     // Ilki : 1 int parametre ister ve belirtilen index'ten String'in sonuna kadar size geri dondurur
     // Ikincisi ise 2 tane int parametre ister, ilk int parametre baslangic index'ini isaret eder ve o index'i

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen isim soyisim giriniz :");

        String adsoyad=scan.nextLine();

        String ad=adsoyad.substring(0, adsoyad.indexOf(' '));
        String soyad=adsoyad.substring(adsoyad.indexOf(' ')+1);

        System.out.println("ad= :" +ad);
        System.out.println("soyad= :" +soyad);


    }
}
