## Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayan ve geçme durumu kontrol edilip ekrana bastırılan program.
Bu proje Java dili ile kullanıcının girdiği 6 dersin ortalamasını almak ve ortalama 60 ın üzerinde ise "Sınıfı Geçti", değilse "Sınıfta kaldı" sonucunu ekrana vermesi 
için oluşturuldu.

- Bunun için ilk başta değişkenler oluşturulur.

`
int mat,fizik,kimya,turkce,tarih,muzik;
`

- Daha sonra sonra kullanıcının notlarını girebilmesi için Scanner sınıfı projeye import ile dahil edilir ve Scanner dan input adında nesne türetilir.

NOT:
`import java.util.Scanner;` ifadesi en üste yani sınıfın da üstüne yazılır. 

```
int mat,fizik,kimya,turkce,tarih,muzik;
Scanner input = new Scanner(System.in);
```

- Bu kullanıcın girdikleri notları okuyabilmesi için int ile oluşturulan değişkenlere input nesnesi nextInt() ile atılır.

```
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=input.nextInt();

        System.out.print("Müzik Notunuz");
        muzik = input.nextInt();
```
- Daha sonra ortalamasını bulan kodlar yazılır.
 
 ```
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6;
        System.out.println("Ortalamanız: "+sonuc);
 ```
 - En sonunda da sınıfı geçip geçmediğini yazan kodlar yazılır ve böylece proje sonlanmış olur.
 
 ```
        String ortalama = sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.print(ortalama);
```
Programın Sonucu ise şöyledir.

![javaortalamasonuc](https://user-images.githubusercontent.com/86554799/180066020-b9969762-580e-4e93-89b4-20893e42e078.jpg)
