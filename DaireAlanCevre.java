import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;






         */

        int r;
        double pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını girin: ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);








    }
}
