import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Kaç tane sayı girmek istiyorsunuz? : ");
        int repeat = input.nextInt();

        int a = 1, max = 0, min = 0;
        boolean ent = true;

        while (repeat > 0) {
            repeat--;
            System.out.print(a + ". Sayıyı Giriniz: ");
            int sayi = input.nextInt();
            a++;
            if (ent) {
                max = sayi;
                min = sayi;
                ent = false;
            } else {
                if (sayi > max) {
                    max = sayi;
                }
                if (sayi < min) {
                    min = sayi;
                }
            }
        }
        System.out.println("En büyük sayı: " + max + "\nEn küçük sayı: " + min);
    }
}
