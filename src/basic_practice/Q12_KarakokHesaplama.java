package basic_practice;

import java.util.Scanner;

public class Q12_KarakokHesaplama {

    /*



     */

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("Pozitif bir tamsayi giriniz :");
        double sayi= scan.nextDouble();

        double karekok = 1;

        for (double i=1; i*i <= sayi ; i+=0.001) {
            karekok=i;
        }
        System.out.printf("%.4f", karekok);  //virgülden sonra kaç basamak olması gerekiyorsa %.4f b yazıyoruz
                                             //vrulden sonra basamak sayısını 4 olarak formatla demek

    }

}
