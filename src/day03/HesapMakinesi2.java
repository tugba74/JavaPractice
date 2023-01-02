package day03;
//methodlar ile yapıp içine switch ekleyerek yapalım

import java.util.Scanner;

public class HesapMakinesi2 {
      /*
        Kullanıcıdan alacaginiz iki sayıyı yine kullanıcıya sectireceginiz
        dört islemden biri ile isleme koyup sonucunu
        yazdırınız.
         */

    static Scanner scan= new Scanner(System.in);


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz:");

       double sayi1=scan.nextDouble();
       double sayi2=scan.nextDouble();

        System.out.println("Yapmak istediginiz islemi seciniz :"
                +"\n\t Toplama icin + \n\tCıkarma icin -\n\tCarpma icin *\n\tBolme icin / ");

        char islem=scan.next().charAt(0);

        //String islem2 =scan.next();

        System.out.println(calculator(islem, sayi1, sayi2));
    }

        /*
    public static String  kullanicidanIslemAl(){  //string işlem kullanıcıdan alıp manupule edeceğiz
        String input =scan.next(); //plus mines times divide
        return input.substring(0,1).trim().toLowerCase(); sadece ilk harflerini alıp diğer harflerini at
       */


    public static double calculator (char islemTipi,double num1,double num2){
        double sonuc;
        sonuc=0;

        switch (islemTipi) {
            case '+':
                sonuc = num1 + num2;
                break;
            case '-':
                sonuc = num1 - num2;
                break;
            case '*':
                sonuc = num1 * num2;
                break;
            case '/':
                sonuc = bolme(num1,num2);
                break;
        }

        return sonuc;
    }
    public static double bolme(double bolunen,double bolen){

        if(bolen==0 && !(bolunen==0))
            return Double.POSITIVE_INFINITY;

            else if (bolen==0 && bolunen==0)
                return Double.NaN;

            else return bolunen/bolen;

        }
    }



