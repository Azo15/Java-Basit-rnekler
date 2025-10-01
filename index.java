import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /*
        ===============================
        1) Kullanıcıdan isim ve yaş alma
        ===============================
        Burda kullanıcıdan adını ve yaşını istiyoruz.
        Sonra yaşına göre "çocuk", "genç", "yaşlı" diye ayırıyoruz :)
         */
//        String name;
//        byte age;
//
//        System.out.println("Enter your name");
//        name = reader.nextLine();
//
//        System.out.println("Enter your age");
//        age = reader.nextByte();
//
//        System.out.println("Hello " + name + " Your Age is : " + age );
//
//        if (age >= 0 && age <= 17) {
//            System.out.println(" You are a Children");
//        }
//        else if (age >= 18 && age <= 35) {
//            System.out.println(" You are a Young Men");
//        }
//        else if (age >= 36 && age <= 85)  {
//            System.out.println(" You are a Old Men ");
//        }
//        else {
//            System.out.println(" Please enter a valid Age");
//        }

        /*
        =====================================
        2) İki sayının çarpımının işaretini bulma
        =====================================
        Kullanıcıdan 2 sayı alıyoruz.
        Çarpımlarının negatif, pozitif veya sıfır olduğunu söylüyoruz.
         */
//        byte num1,num2;
//
//        System.out.println("Birinci Sayiyi giriniz");
//        num1 = reader.nextByte();
//
//        System.out.println("Ikinci Sayiyi giriniz");
//        num2 = reader.nextByte();
//
//        if(num1*num2 < 0){
//            System.out.println("Sayilarin Carpimi negatiftir!!");
//        }
//        else if(num1*num2 > 0){
//            System.out.println("Sayilarin Carpimi pozitiftir!!");
//        }
//        else if (num1*num2 == 0){
//            System.out.println("Sayilarin Carpimi Sifirdir ..");
//        }
//        else{
//            System.out.println("Lutfen Gecerli bir giris Yapiniz");
//        }

        /*
        ===============================
        3) İki sayının farkını bulma
        ===============================
        Burda da yine iki sayı alıp hangisi büyükse
        farkını buluyoruz. Aslında abs() kullanabilirdik ama biz elle yaptık :D
         */
//        byte num1,num2;
//
//        System.out.println("Birinci Sayiyi giriniz");
//        num1 = reader.nextByte();
//
//        System.out.println("Ikinci Sayiyi giriniz");
//        num2 = reader.nextByte();
//
//        int result=0;
//        if (num1 > num2){
//             result = num1 - num2;
//        }
//        else{
//             result = num2 - num1;
//        }
//        System.out.println("Girilen Sayilarin Arasindaki Fark = " + result);

        /*
        ===============================
        4) Sayının tek mi çift mi olduğunu bulma
        ===============================
        Kullanıcı bir sayı giriyor, biz de mod alıp tek mi çift mi olduğunu söylüyoruz.
        Hoca kızmasın diye extra "geçersiz değer" yazdık ama aslında gerek yoktu :)
         */
//        double num;
//
//        System.out.println("Bir sayi giriniz: ");
//        num = reader.nextDouble();
//
//        if(num % 2 == 0){
//            System.out.println("Girilen sayi cifttir");
//        }
//        else if(num % 2 == 1){
//            System.out.println("Girilen sayi tektir");
//        }
//        else {
//            System.out.println("Lutfen gecerli bir deger giriniz!!");
//        }
    }
}
