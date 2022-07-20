import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
	KDV tutarı hesaplayan programı yazınız.
	 */

        //değişkenleri tanımlama
        double tutar, kdvOrani18 = 0.18, kdvOrani8 = 0.08, kdvTutar18, kdvTutar8, kdvliTutar18, kdvliTutar8; ;

        //Scanner sınıfını tanımlama
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alma
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        //kdv tutarı ve kdvli tutarı hesaplama
        kdvTutar18 = tutar * kdvOrani18;
        kdvTutar8 = tutar * kdvOrani8;

        kdvliTutar18 = tutar + kdvTutar18;
        kdvliTutar8 = tutar + kdvTutar8;

        String sonuc = (tutar >=0 && tutar <= 1000) ?"KDV ORANI: " + kdvOrani18 + "\n" +"KDV'Lİ TUTAR: "+ kdvliTutar18 :
                "KDV ORANI: " + kdvOrani8 +  "\n" + "KDV'Lİ TUTAR : " + kdvliTutar8;
        System.out.println("KDV'SİZ TUTAR : " + tutar);
        System.out.println(sonuc);
    }
}
