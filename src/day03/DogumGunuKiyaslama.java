package day03;

import java.util.Scanner;

public class DogumGunuKiyaslama {
    /*
    kullanıcıdan iki farklı dogum gunu tarihini alıp,
    kimin önce doğduğunu consola yazdırın
    2010/05/23


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yil /Ay/ Gun olarak karsilastirmak" +
                "istediğiniz ilk dogum gununu giriniz"); //ahmet

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();

        System.out.println("lutfen Yil /Ay7Gun olarak karsilastirmak" +
                "istediğiniz ilk dogunm gununu giriniz"); //ayşe
        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();

        if (yil1 > yil2) {
            System.out.println("ayse ahmetten buyuktur");
        } else if (yil2 > yil1) {
            System.out.println("ahmet ayseden buyuktur");

        } else { //bu satıra geldiğimizde yıllar eşit demektir.bu durumda aylara bakmak için yeni if bloğu olusturulur.
            if (ay1 > ay2) {
                System.out.println("ayse ahmetten buyuktur");
            } else if (ay2 > ay1) {
                System.out.println("ahmet ayseden buyuktur");
            } else { //bu satıra geldiğimizde aylar eşit demektir.bu durumda günlere bakmak için yeni if bloğu olusturulur.
                if (gun1 > gun2) {
                    System.out.println("ayse ahmetten buyuktur");
                } else if (gun2 > gun1) {
                    System.out.println("ahmet ayseden buyuktur");
                } else System.out.println("aynı gun dogdunuz");
            }
        }


        System.out.println("***************************2. Cozum***************************");

        int ahmetDogumGunu = yil1 * 10000 + ay1 * 100 + gun1; //20100812
        int ayseDogumGunu = yil2 * 10000 + ay2 * 100 + gun2;  //20100824

        if (ahmetDogumGunu > ayseDogumGunu)
            System.out.println("Ayse daha buyuktur");
        else if (ayseDogumGunu > ahmetDogumGunu)
            System.out.println("Ahmet daha buyuktur");
        else System.out.println("Ayni gun dogdunuz");
    }
}