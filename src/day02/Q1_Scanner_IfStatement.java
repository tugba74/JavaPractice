package day02;

import java.util.Scanner;

public class Q1_Scanner_IfStatement {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

        Scanner scan=new Scanner (System.in);

        System.out.print("Günde kaç bardak içiyorsunuz? :  ");
        double bardaksayisi=scan.nextDouble(); //int de alabiliriz

        System.out.print ("Bir bardak cay için kaç seker kullanıyorsunuz: " );
        double seker=scan.nextDouble();

        double yillikTuketimKg = (bardaksayisi * seker * 2.77 * 365) / 1000;
        double kirkYillikTuketimKg = (yillikTuketimKg*40);

        if(seker==0) {
            System.out.println("Aferin, böyle devam et");
        }else{
            System.out.println("Yillik seker tuketiminiz   " +yillikTuketimKg+" kg'dir. \n" +
                    "40 yillik seker tuketimiz   " + kirkYillikTuketimKg + "kg'dir.");
       }







    }

}
