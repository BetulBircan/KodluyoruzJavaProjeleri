import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
	Vücut Kitle İndeksi Hesaplama

    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
    "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
	 */

        //Değişkenleri Tanımlama
        double height, weight, bodyMassIndex;

        //Kullanıcıdan Bilgileri Alma
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        weight = input.nextDouble();

    }
}
