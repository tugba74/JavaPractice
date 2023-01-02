package basic_practice;

public class Q13_CarpimTablosu {
    /*
    kullacının grdğ say kadar carpim tablosunubize yazdıran bir program yazacağiz
    */

    public static void main(String[] args) {

        int input=10;
        carpimTablosu(input);


    }

    private static void carpimTablosu(int input) {

        for(int i=1; i<=input; i++) {
            for (int j=1; j<=input; j++) {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
    }