import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {


        int number;
        int expon;
        int total = 1;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();


        System.out.print("Üs giriniz: ");
        expon = input.nextInt();


        for (i = 1; i <= expon; i++) {
            total *= number;
        }
        System.out.println("Cevap: " + total);
    }
}
