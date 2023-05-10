import java.util.Scanner;

public class DeseneGoreMetot {
    static int metot(int a, int x) {
        if (a > 0) {
            System.out.print(a + " ");
            return metot(a - 5, x);
        } else {
            System.out.print(a + " ");
            while (a != x) {
                System.out.print((a += 5) + " ");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("BIR SAYI GIRIN: ");
        int sayi = input.nextInt();
        metot(sayi, sayi);
    }
}
