package basic_practice;

import java.util.Scanner;

public class Q4_Ternary_RakamPozitifSayi {

    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ;
        System.out.println("lütfen bir sayi girirniz");
        int sayi=scan.nextInt();


        if(sayi>=0){
            System.out.println(sayi>=0 && sayi<10 ? "rakam" : "pozitif sayi");

        }else if (sayi<0){
            System.out.println("negatif sayi");
        }



    }
}


