package day04;

public class StringtekiSayilariTopla {
    /*
     * write a method which accepts a String as parameter
     * and prints the sum of the digits, present in the given string
     *
     * Parametre olarak bir String kabul eden ve verilen Stringde
     * bulunan rakamların toplamını yazdiran bir method yazın.
     *
     * Input : ade1r4d3
     * Output : 1+4+3 = 8
     *
     * Use Character.isDigit()
     *     Integer.valueOf() //valueof=stringin integer değerini bize döndürür
     */
    public static void main(String[] args) {

        String kelime="ade1r4d3";
        rakamlarinToplami(kelime);
    }
    public static void rakamlarinToplami(String input){

        int toplam=0;

        for (int i=0; i<=input.length()-1;i++) {
            if (Character.isDigit(input.charAt(i))) {///i inci karakter bir sayı ise
                toplam+= Integer.valueOf(""+input.charAt(i));
            }
        }



    }
}
