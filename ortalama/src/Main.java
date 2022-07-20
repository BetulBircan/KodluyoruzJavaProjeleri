import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         */

        // Değişkenleri Oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlama
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri alma
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        //Hesaplama
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız: " + sonuc);

        String durum = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.println(durum);
    }
}
