package basic_practice;

public class Q11_Faktoriyel {
    public static void main(String[] args) {
        /*
        parametre olarak integer kabul eden ve sayinin faktöriyelin hesaplayan bir method yazınız

        orn:
        input= 6;
        output=6!=654*3*2*1=720

         */
       int input=5;
       faktoriyel(input);

    }

    private static void faktoriyel(int input) {

        System.out.print(input + "!=");

        int fact =1; //0 olursa çarpım olacağından sonuc hep 0 çıkar o nedenle 1 diyoruz

        for(int i=input; i>1; i--) {
            System.out.print(i+ "*");
            fact*=i;
        }

        System.out.print("1="+fact);
    }
}
