package day04;

import java.util.Arrays;

public class KelimeyiHarflerineAyirma {
    /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */
    public static void main(String[] args) {
         String name="Semra";
         kelimeninHarfleriArrayi(name);
         kelimeninHarfleriArrayi("String");
    }

    public static void kelimeninHarfleriArrayi(String input) {  //index=length-1 dir

        char[] output = new char[input.length()]; //dinamik olsun diye inputun uzunluğu kadar diyoruz 4 yapsak sadece 4 hafli bir şey girebilir.
        for (int i = 0; i < input.length(); i++) {  //input.length int sayısal değer döndürür
        output[i] = input.charAt(i);

    }
        System.out.println("Kelimenin harfleri array'i :" + Arrays.toString(output));  //[S, e, m, r, a]

}


}
