import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
	KDV tutarı hesaplayan programı yazınız.
	 */

        //değişkenleri tanımlama
        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvTutar1, kdvTutar2, kdvliTutar1, kdvliTutar2; ;

        //Scanner sınıfını tanımlama
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alma
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
    }
}
