package day06;

public class Q3_Arrays {
    // Create an array of float and calculat their sum

    public static void main(String[] args) {
        System.out.println("*************FOR COZUMU *************");
        float[] sayilar = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Toplam = " + toplam);

        System.out.println("*************WHİLE COZUMU 1 *************");
        //while ile çözüm

        toplam = 0;
        int index = sayilar.length - 1;

        while (index >= 0) {
            toplam += sayilar[index];
            index--;
        }
        System.out.println("Toplam = " + toplam);

        System.out.println("*************WHİLE COZUMU 2 *************");
        toplam = 0;
        index = 0;
        while (index < sayilar.length) {
            toplam += sayilar[index];
            index++;
        }
        System.out.println("Toplam = " + toplam);
        System.out.println("*************DO WHILE COZUMU *************");
        toplam = 0;
        index = 0;


    }
}
