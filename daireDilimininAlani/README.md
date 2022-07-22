# Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program

Bu proje Java dili ile yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulmak için oluşturuldu.

**Formül: (𝜋 . (r . r) . 𝛼) / 360**

**𝜋 sayısını = 3.14 alınız.**

- Bunun için ilk başta gerekli değişkenler oluşturuldu ve kullanıcıdan bilgiler alınır.

```
        //Değişkenleri tanımlama
        int r, merkezAci;
        double pi = 3.14, daireDilimAlani;


        //Kullanıcıdan Bilgileri Alma
        Scanner scan = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = scan.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        merkezAci = scan.nextInt();
```

- Daha sonra daire dilimin alanı hesaplanır ve ekrana yazdırılır. Böylece proje sonlanmış olur.

```
        //Daire Diliminin Alannını Hesaplama
        daireDilimAlani = (pi * (r* r) * merkezAci) / 360;
        System.out.println("Daire Diliminin Alanı : " + daireDilimAlani);
```

Programın sonucu ise şöyledir:

![dairedilimalan](https://user-images.githubusercontent.com/86554799/180576046-807233f0-2b62-40dd-8072-4f91f9b189e7.jpg)

