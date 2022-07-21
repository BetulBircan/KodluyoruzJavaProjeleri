import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını ve çevresini hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
	 */

        //Değişkenleri Tanımlama
        int a, b, c;
        double cevre, alan, u;

        //Kullanıcıdan bilgileri alma
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b = input.nextInt();
        System.out.print("3.Kenarı Giriniz: ");
        c = input.nextInt();


    }
}
