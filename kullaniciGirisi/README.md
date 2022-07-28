# Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını soran, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program.

Bu proje eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sormak, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve 
unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
yazması için oluşturuldu.

- Bunun için ilk başta gerekli değişkenler alınır ve kullanıcıdan bilgilerin alınabilmesi için gerekli işlemler yapılır.

```
//Değişkenleri tanımlama ve kullanıcıdan bilgi alma işlemi
        String userName, password, nullification, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();
```

- Daha sonra eğer şifre doğruysa başarılı değilse hatalı giriş yaptınız yazması için gerekli işlemler yapılır.

```
 if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı...");
        }
        else {
            System.out.println("Hatalı Giriş!");
        }
```

- En sonunda eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise 
ekrana" Şifre oluşturulamadı, lütfen başka şifre giriniz."sorun yoksa "Şifre oluşturuldu" yazması için gerekli işlemler yapılır ve böylece proje sonlanmış olur.

```
//Eğer şifre doğruysa başarılı değilse hatalı giriş yaptınız işlemlerini yapma
        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı...");
        }
        else {
            System.out.println("Hatalı Giriş!");
            /*eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
             gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
             sorun yoksa "Şifre oluşturuldu" yazan program
            / */
            System.out.println("Şifreyi Sıfırlamak ister misiniz?\nyes\nno");
            nullification = input.nextLine();
            if(nullification.equals("yes")) {
                newPassword = input.nextLine();
                if(newPassword.equals("java123") || newPassword.equals(password) ) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                }
                else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            }
        }
```

Programın sonucu ise şöyledir: 

![kullanicigirisi1](https://user-images.githubusercontent.com/86554799/181645174-c37f2511-f47d-4258-affd-60c8d31ee44d.jpg)

![kullanicigirisi2](https://user-images.githubusercontent.com/86554799/181645209-d07f8116-54a7-448b-9c27-12996e4bf157.jpg)

![kullanicigirisi3](https://user-images.githubusercontent.com/86554799/181645229-2ef26948-56d0-4368-80f0-ba73b8d00c05.jpg)
![kullanicigirisi4](https://user-images.githubusercontent.com/86554799/181645260-c97730df-9085-4209-b54b-07a83be394ac.jpg)
