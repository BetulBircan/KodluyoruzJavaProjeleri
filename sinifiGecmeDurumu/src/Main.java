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
    }
}
