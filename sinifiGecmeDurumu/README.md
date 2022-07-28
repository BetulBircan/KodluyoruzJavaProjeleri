# Kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan ve eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmamasını sağlayan program.

Bu proje kullanıcının not durumuna göre sınıfı geçme durumunu hesaplaması ve eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmamasını sağlaması
için oluşturuldu.

**Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik**

**Geçme Notu : 55**

- Bunun için ilk başta gerekli değişkenler tanımlanır ve kullanıcıdan ders notlarının girmesi sağlanır.

```
//Değişkenleri Oluşturma ve Kullanıcıdan ders notları bilgisini alma
        int mat, fizik, turkce, kimya, muzik;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
```
- Sonrasında kullanıcının not durumuna göre sınıfı geçme durumunu hesaplaması işlemleri yapılır.

```
avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if(avarage <= 55) {
            System.out.println("Sınıfta Kaldınız, Seneye Tekrar Görüşmek Üzere!!!");
        }
        else {
            System.out.println("Tebrikler. Sınıfı Geçtiniz!!!");
        }
        System.out.println("Ortalamanız: " + avarage);
```

- En sonunda eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmamasını sağlaması işlemleri yapılır ve böylece proje sonlanmış olur.

```
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmamasının belirlenmesi
        if((mat >=0 && mat <=100) && (fizik >=0 && fizik <=100) && (turkce >=0 && turkce <=100) &&
                (kimya >=0 && kimya <=100) && (muzik >=0 && muzik <=100) ) {

            //sınıfı geçme veya kalma durumunun belirlenmesi
            avarage = (mat + fizik + turkce + kimya + muzik) / 5;

            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız, Seneye Tekrar Görüşmek Üzere!!!");
            } else {
                System.out.println("Tebrikler. Sınıfı Geçtiniz!!!");
            }
            System.out.println("Ortalamanız: " + avarage);
        }
        else {
            System.out.println("Ortalama Hesaplamasına Katılamaz");
        }
```

Programın sonucu ise şöyledir:

![sınıfıgecmebasarili](https://user-images.githubusercontent.com/86554799/181653136-05233729-f94b-4f49-8d21-1032e1e6e5e9.jpg)

![sınıfıgecmebasarisiz](https://user-images.githubusercontent.com/86554799/181653160-9d9c31b8-7c98-4f92-965a-2607a599138f.jpg)

![sınıfıgecmegecersiz](https://user-images.githubusercontent.com/86554799/181653171-530e560a-ee6e-4f63-8055-90069f662156.jpg)
