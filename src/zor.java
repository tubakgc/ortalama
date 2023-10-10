 import java.util.Scanner;

 public class zor {
    public static void main(String[] args) {
        //Değişken oluştur
 int mate, fizik, kimya, turkce, tarih, muzik;

 //scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunu giriniz:");
        mate= inp.nextInt();

        System.out.print("fizik notunuz:" );
        fizik=inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya=inp.nextInt();

        System.out.print("türkçe notunuz:");
        turkce=inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih=inp.nextInt();

        System.out.print("müzik notunuz:");
        muzik= inp.nextInt();

        int toplam = (mate + fizik + kimya + turkce + tarih + muzik );
        double ort = toplam / 6.0 ;

        System.out.println("ortalamanız : "+ ort);

        boolean gecmeNotu = ort >= 60;

        String sonuc = gecmeNotu ? "Geçti" : "Kaldi";

        System.out.println("Geçme notunuz: " + ort + " " + sonuc);


    }
}
