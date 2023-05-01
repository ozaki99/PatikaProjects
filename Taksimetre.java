import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
        */

        int km;
        double perKm = 2.20, total = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç KM yol gidileceğini giriniz: ");
        km = input.nextInt();

        total += (km * perKm);

        //Koşul operatörlerinden soru işareti true veya false için kullanılır

        total = (total < 20) ? 20 : total;

        //burada total 20den küçükse soruda söylendiği gibi 20 alıncak ama büyükse totalin kendisi alınacak.

        System.out.println("Toplam Tutar: " + total);

    }
}
