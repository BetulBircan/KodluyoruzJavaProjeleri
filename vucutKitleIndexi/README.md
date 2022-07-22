# Kullanıcıdan boy ve kilo değerlerini alıp "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdıran program

Bu proje Java dili ile kullancıdan boy ve lkilo bilgileri alınıp vücut kitle index değerini hesaplaması için oluşturulmuştur.

**Formül: Kilo (kg) / Boy(m) . Boy(m)**

- Vücut kitle indexi hesaplanması için gerekli değişkenler tanımlanır ve kullanıcıdan bilgilerin alınması sağlanır.

```
        //Değişkenleri Tanımlama
        double height, weight, bodyMassIndex;

        //Kullanıcıdan Bilgileri Alma
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        weight = input.nextDouble();
```

- Sonrasında vücut kitle indexinin hesaplanması için gereki hesaplamalar yapılır ve ekrana yazdırılır. Böylece proje sonlanmış olur.

```
        //Vücut Kitle İndexi Hesaplama
        bodyMassIndex = weight / (height * height);
        System.out.println("Vücut Kitle İndexiniz : " + bodyMassIndex);
```

Programın sonucu ise şöyledir: 

![vücutkitleindexihesaplama](https://user-images.githubusercontent.com/86554799/180578797-80f36dff-47ed-4795-b455-cb0741410399.jpg)

