import java.util.Scanner;


public class GelismisHesapMakinesi {

    static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı: ");
        int a = input.nextInt();
        System.out.print("2. sayı: ");
        int b = input.nextInt();
        System.out.println("Cevap: " + (a + b));
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı: ");
        int a = input.nextInt();
        System.out.print("2. sayı: ");
        int b = input.nextInt();
        System.out.println("Cevap: " + (a - b));
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı: ");
        int a = input.nextInt();
        System.out.print("2. sayı: ");
        int b = input.nextInt();
        System.out.println("Cevap: " + (a * b));
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı: ");
        double a = input.nextDouble();
        System.out.print("2. sayı: ");
        double b = input.nextDouble();
        System.out.println("Cevap: " + (a / b));
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = input.nextInt();
        int tempA = a;
        System.out.print("Üssü: ");
        int b = input.nextInt();
        for (int i = 1; i <= b; i++) {
            int toplam = tempA;
            tempA *= a;
            if (i == b) {
                System.out.println("Cevap: " + toplam);
            }
        }
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Faktoriyel ? : ");
        int a = input.nextInt();
        int total = 1;

        if (a < 1){
            System.out.println("Lütfen daha büyük bir sayı giriniz...");
        }else{

            for (int i = 1; i <= a; i++) {
                total = total * i;
            }

        }
        System.out.println(a + " Faktöriyel = " + total);
    }

    static void modding() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı: ");
        Double a = input.nextDouble();
        System.out.print("2. sayı: ");
        Double b = input.nextDouble();
        System.out.println("Cevap: " + (a % b));
    }

    static void areaPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğu: ");
        int a = input.nextInt();
        System.out.print("Uzun kenar uzunluğu: ");
        int b = input.nextInt();
        if (a < 1 || b < 1){
            System.out.println("Hata. Lütfen daha büyük bir sayı giriniz...");
        }else {
            System.out.println("Alan: " + (a * b));
            System.out.println("Çevre: " + 2 * (a + b));
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gelişmiş hesap makinesine hoşgeldiniz..");


        int userAnswer;
        do {
            System.out.print("Lütfen yapmak istediğiniz işlemi\n\n" +
                    "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "9- Çıkış\n\nSeçiniz: ");
            userAnswer = input.nextInt();

            switch (userAnswer) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    areaPerimeter();
                    break;
                case 9:
                    System.out.println("Hoşçakalın...");
                    break;
                default:
                    System.out.println("Hatalı bir işlem girdiniz!!!");
            }
        } while (userAnswer != 9);
    }
}









    /*
Gelişmiş Hesap Makinesi
Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
*/