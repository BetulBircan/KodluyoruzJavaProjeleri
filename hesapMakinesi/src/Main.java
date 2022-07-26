import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	 Hesap makinesini switch-case kullanarak yapınız.
	 */

        //DEĞİŞKENLERİ TANIMLAMA VE KULLANICIDAN BİLGİLERİ ALMA
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        System.out.println("Birini Seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

    }
}
