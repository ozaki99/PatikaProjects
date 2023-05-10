import java.sql.SQLOutput;
import java.util.Scanner;

public class DeseneGoreMetot {
    static int metot(int a, int oruntu, int x) {
        if (a > 0) {
            System.out.print(a + " ");
            return metot(a - oruntu, oruntu, x);
        } else {
            System.out.print(a + " ");
            while (a != x) {
                System.out.print((a += oruntu) + " ");
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;
        do {
            System.out.println("\nORUNTU OLUSTURMA PROGRAMINA HOSGELDINIZ\n" +
                    "1- PROGRAMI CALISTIR\n" +
                    "2- NASIL CALISIR\n" +
                    "3- CIKIS");
            System.out.print("\n--> : ");
            answer = input.nextInt();

            if (answer == 1){
                System.out.print("BIR SAYI GIRIN: ");
                int sayi = input.nextInt();
                System.out.print("ORUNTU SAYISI GIRIN: ");
                int oruntu = input.nextInt();
                metot(sayi, oruntu, sayi);
            }
            if (answer == 2){
                System.out.println("ILK ONCE BIR SAYI GIRIN ARDINDAN KACAR KACAR \n" +
                        "AZALIP ARTACAGINI BELIRLEYEREK BIR ORUNTU OLUSTURUN.\n");
            }
            if (answer == 3){
                System.out.println("HOSCAKALIN...");
                break;
            }
            if (answer > 3){
                System.out.println("HATALI GIRIS YAPTINIZ!!!");
            }
        } while (answer != 3);

    }
}
