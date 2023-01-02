package basic_practice;

import java.util.Scanner;

public class Q10_StringTekrarlYazdrma {

       /*
        kullanıcıdan 3 hafrten uzun bir kelime alınır ve 10dan kucuk bir sayi alınız
        KElimenin son 2 harfini girilen sayi kadar yanyana yazdıran bir program yazınız

        örn:
        ınput Kelime=Mustafa sayi=3
        output: fafafa
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir kelime giriniz : ");
        String kelime=scan.next();

        System.out.print("10'dan kucuk br tamsayi giriniz : ");
        int sayi =scan.nextInt();

        String son2harf = kelime.substring(kelime.length()-2);

        for(int i=0; i<sayi ; i++){
            System.out.println(son2harf);
        }
    }
}
