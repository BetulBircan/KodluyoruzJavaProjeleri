import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
	 */

        //Değişkenleri tanımlama
        int r, merkezAci;
        double pi = 3.14, daireDilimAlani;


        //Kullanıcıdan Bilgileri Alma
        Scanner scan = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = scan.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        merkezAci = scan.nextInt();


    }
}
