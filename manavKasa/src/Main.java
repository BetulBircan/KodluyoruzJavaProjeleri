import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
	 */


        //Değişkenleri Tanımlama
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo,
                armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,  total;

        //Kullanıcıdan Bilgileri Alma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKilo = scanner.nextDouble();

        //Toplam tutarı hesaplama
        armut *= armutKilo;
        elma *= elmaKilo;
        domates *= domatesKilo;
        muz *= muzKilo;
        patlican *= patlicanKilo;

        total = armut + elma + domates + muz + patlican;

        System.out.println("Toplam Tutar : " + total + " TL" );
    }
}
