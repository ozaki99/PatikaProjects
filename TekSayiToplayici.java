import java.util.Scanner;

public class TekSayiToplayici {
    public static void main(String[] args) {

        /*

        int n;
        int total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı girin: ");
            n = input.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        } while (n > 0);

        System.out.println(total);

        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        */

        int num;
        int total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            if ((num % 2 == 0) && (num % 4 == 0)){
                total = total + num;
            }
        } while (num % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
