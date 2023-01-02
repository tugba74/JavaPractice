package day05;

public class Q3_GirilensayiyiTersCevirme {

    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */
    public static void main(String[] args) {

        int input = 12345;

        System.out.println("Girdiginiz sayinin ters cevrilmis hali =" + reverseNumber(input));

    }

    private static int reverseNumber(int input) {
        int reverseNum = 0; //bos konteynır olusturduk

        while (input > 0) { //inputumuz 0 dan buyuk oldugu muddetce calısısn

            reverseNum = input % 10 + reverseNum * 10; //mod 10 3 tür.
            input = input / 10;
        }


        return reverseNum;
    }
}

