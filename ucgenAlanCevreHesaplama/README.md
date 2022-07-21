# Üç kenar uzunluğunu kullanıcıdan alınan üçgenin alanını ve çevresini hesaplayan program

Bu projede Java dili ile üç kenar uzunluğu kullanıcıdan alınan üçgenin alanını ve çevresini hesaplamak için oluşturuldu.

**Formül:**

**Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢**

**𝑢 = (a+b+c) / 2**

**Alan = 𝑢 . (𝑢 − 𝑎) . (𝑢 − 𝑏) . (𝑢 − 𝑐)**

- Bunun için ilk başta üç kenar için değişkenler oluşturulur.

```
//Değişkenleri Tanımlama
        int a, b, c;
        double cevre, alan, u;
```

- Daha sonra üç kenarın kullanıcıdan alınabilmesi için Scanner sınfı projeye import ile dahil edilir ve Scanner dan input adında nesne türetilir ve de kullanıcının 
girdiği tutarı okuyabilmesi için double ile oluşturulan değişkene input nesnesi nextInt() ile atılır.

```
//Kullanıcıdan bilgileri alma
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b = input.nextInt();
        System.out.print("3.Kenarı Giriniz: ");
        c = input.nextInt();
```

- En sonunda üçgenin alanını ve çevresini hesaplayan kodlar yazılır ve de ekrana yazdırılır. Böylece proje sonlanmış olur.

```
 //Çevre Hesaplama
        u = (a + b + c) / 2;
        cevre = 2*u;

        //Alan Hesaplama
        alan = u * (u-a) * (u-b) * (u-c);

        System.out.println("Üçgein Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);
```

Programın sonucu ise şöyledir:

![ucgenalanvecevre](https://user-images.githubusercontent.com/86554799/180145503-aaeb782b-ecfa-4188-b5ee-562c8210dad1.jpg)

