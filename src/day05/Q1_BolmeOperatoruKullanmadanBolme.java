package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1_BolmeOperatoruKullanmadanBolme {


    static int bolum=0; //class da olusturursak gunes gıbı parlar

    //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bolunen sayıyı giriniz");
        int bolunen = scan.nextInt();
        System.out.println("lütfen bolen sayıyı giriniz");
        int bolen = scan.nextInt();

        System.out.println(bolunen + " / " + bolen + " = " + bol(bolunen, bolen));
    }

    public static int bol(int bolunen, int bolen) {

        while(bolunen>=bolen){
            bolunen-= bolen;
            bolum++;
        }
        return bolum;
    }


}
