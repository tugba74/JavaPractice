package day01;

public class Q2_Print {
    public static void main(String[] args) {

        /*
        76453 sayısının her bir basamağını konsolda alt alta yazdırın
        input: 76453
        output: 7
                6
                4
                5
                3

        System.out.println("7\n6\n4\n5\n3"); böyle çözersek dinamik olmaz her koşula uymaz. modulus ile çözülmeli
       */

        int sayi=35981;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;
        System.out.println(onbinler + "\n"+ binler +"\n"+ yuzler +"\n" + onlar +"\n"+birler );

    }
}
