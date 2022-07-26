import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	 Hesap makinesini switch-case kullanarak yapınız.
	 */

        //değişkenleri tanımlama ve kullanıcıdan bilgileri alma
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        System.out.println("Birini Seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        //switchcase ile 4 işlemli hesap makinesi işlemlerini yapma
        switch (select) {
            case 1:
                int toplam = number1 + number2;
                System.out.println("Toplam : " + toplam);
                break;
            case 2:
                int cikarma= number1 - number2;
                System.out.println("Çıkarma : " + cikarma);
                break;
            case 3:
                int carpma = number1 * number2;
                System.out.println("Çarpma : " + carpma);
                break;
            case 4:
                if(number2 != 0) {
                    int bolme = number1 / number2;
                    System.out.println("Bölme: " + bolme);
                }
                else {
                    System.out.println("0 a bölünemez!!");
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız.Tekrar deneyin...");
        }

    }
}
