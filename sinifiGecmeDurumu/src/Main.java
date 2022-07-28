import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan programı yazınız.
	Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
	*/
        //Değişkenleri Oluşturma ve Kullanıcıdan ders notları bilgisini alma
        int mat, fizik, turkce, kimya, muzik;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmamasının belirlenmesi
        if((mat >=0 && mat <=100) && (fizik >=0 && fizik <=100) && (turkce >=0 && turkce <=100) &&
                (kimya >=0 && kimya <=100) && (muzik >=0 && muzik <=100) ) {

            //sınıfı geçme veya kalma durumunun belirlenmesi
            avarage = (mat + fizik + turkce + kimya + muzik) / 5;

            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız, Seneye Tekrar Görüşmek Üzere!!!");
            } else {
                System.out.println("Tebrikler. Sınıfı Geçtiniz!!!");
            }
            System.out.println("Ortalamanız: " + avarage);
        }
        else {
            System.out.println("Ortalama Hesaplamasına Katılamaz");
        }
    }
}
