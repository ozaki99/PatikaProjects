import java.util.Scanner;

public class ThePerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
                if (toplam == sayi) {
                    System.out.println(sayi + " Sayısı mükemmel sayıdır.");
                    break;
                }
            }
        }
        if (toplam != sayi) {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
