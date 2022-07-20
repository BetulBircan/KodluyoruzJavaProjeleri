# Java ile kullanıcıdan alınan para değeri 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program.

Bu proje Java dili ile kullanıcının girdiği tutar 0 ve 1000 tl arasında ise KDV oranını %18 olarak, 1000 TL den büyük ise %8 olarak KDV tutarını hesaplayıp
ekrana yazdırması için oluşturuldu.

- Bunun için ilk başta değişkenler oluşturulur.

```
  //değişkenleri tanımlama
  double tutar, kdvOrani18 = 0.18, kdvOrani8 = 0.08, kdvTutar18, kdvTutar8, kdvliTutar18, kdvliTutar8;
```

- Daha sonra sonra kullanıcının notlarını girebilmesi için Scanner sınıfı projeye import ile dahil edilir ve Scanner dan input adında nesne türetilir.

**NOT: `import java.util.Scanner;` ifadesi en üste yani sınıfın da üstüne yazılır.**

```
  //Scanner sınıfını tanımlama
  Scanner input = new Scanner(System.in);
```

- Kullanıcının girdiği tutarı okuyabilmesi için double ile oluşturulan değişkene input nesnesi nextDouble() ile atılır.

```
  //Kullanıcıdan değerleri alma
  System.out.print("Ücret Tutarını Giriniz: ");
  tutar = input.nextDouble();
```

- Sonrasında Kdv tutarlarını hesaplauan kodlar yazılır.

```
  //kdv tutarı ve kdvli tutarı hesaplama
  kdvTutar18 = tutar * kdvOrani18;
  kdvTutar8 = tutar * kdvOrani8;

  kdvliTutar18 = tutar + kdvTutar18;
  kdvliTutar8 = tutar + kdvTutar8;
```

- En sonunda tutar 0 ve 1000 TL arasındaysa %18 olarak, 1000TL nin üzerindeyse %8 olarak hesaplayan kodşar yazılır ve böylece proje sonlanmış olur.

```
    String sonuc = (tutar >=0 && tutar <= 1000) ?"KDV ORANI: " + kdvOrani18 + "\n" +"KDV'Lİ TUTAR: "+ kdvliTutar18 :
                "KDV ORANI: " + kdvOrani8 +  "\n" + "KDV'Lİ TUTAR : " + kdvliTutar8;
    System.out.println("KDV'SİZ TUTAR : " + tutar);
    System.out.println(sonuc);
```

Programın sonucu ise şöyledir:

**%18**

![yüzde18kdv](https://user-images.githubusercontent.com/86554799/180098333-0e8d102f-9992-4f66-8b47-922f951327a8.jpg)

**%8**

![yüzde8kdv](https://user-images.githubusercontent.com/86554799/180098352-d919dc94-c381-42bc-9b61-f5e556410ab9.jpg)
