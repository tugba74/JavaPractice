package day03;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alacaginiz iki sayıyı yine kullanıcıya sectireceginiz
        dört islemden biri ile isleme koyup sonucunu
        yazdırınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz:");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("Yapmak istediginiz islemi seciniz :"
                +"\n\t1. Toplama \n\t2. Cıkarma\n\t3. Carpma\n\t4. Bolme ");

        int islem = scan.nextInt();
        char islem2=scan.next().charAt(0); //kullanıcıdan char alma yolu
        char a='*'; //tek karakter oldupu müddetçe bir sıkıntı yok

        if (islem==1) System.out.println("Girdiginiz sayiların toplami=" +(sayi1+sayi2));
        else if (islem==2) System.out.println("Girdiginiz sayiların farki=" +(sayi1-sayi2));
        else if (islem==3) System.out.println("Girdiginiz sayiların çarpimi=" +(sayi1*sayi2));
        else if (islem==4) System.out.println("Girdiginiz sayiların bolmumu=" +(sayi1/sayi2));
        else System.out.println("hatalı giris yaptiniz");









    }
}
