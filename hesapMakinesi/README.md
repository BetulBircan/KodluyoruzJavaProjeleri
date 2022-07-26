# Switch case ile hesap makinesi yapma programı.

Bu proje Java dilinde hesap makinesini switch-case kullanarak yapmak için oluşturuldu.

- İlk başta gerekli değişkenler tanımlanır ve kullanıcıdan bilgileri alma işlemi yapılır.

```
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
```

- Sonrasında switch case yapısı kullanılarak dört işlem yapma işlemleri yapılır ve böylece proje burada sonlanmış olur.

**NOT: Sıfıra bölme işlemi yapıldığında ne yapılacağı işlemi burada yapılır.

```
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
```

Programın sonucu ise şöyledir: 

![hesapmakinesi1](https://user-images.githubusercontent.com/86554799/181129628-65d12ad5-3124-4fe1-8e63-0552dccb40d3.jpg)
![hesapmakinesi2](https://user-images.githubusercontent.com/86554799/181129679-1ad0588d-11cc-4c67-81a5-a4f39f9d9820.jpg)
