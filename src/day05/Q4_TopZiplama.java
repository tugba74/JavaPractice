package day05;

public class Q4_TopZiplama {
     //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {
        double yukseklik=2100;
        double topunToplamYolu=0;
        int yerevurmasayisi=0;

        do {
            yerevurmasayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=(0.75);
            topunToplamYolu+=yukseklik;


        }while(yukseklik>=100);

            System.out.println("topun yere vurma sayisi= "+yerevurmasayisi+
                               "\nTopun katettigi toplam yol =" + topunToplamYolu);
        }
    }

