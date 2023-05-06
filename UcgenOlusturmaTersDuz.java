import java.util.Scanner;

public class UcgenOlusturmaTersDuz {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("\n\nPyramit Maker by ozaki99\nWelcome\n");
        System.out.println("Nasıl bir piramit oluşturmak istediğinizi yazın.");
        System.out.print("düz / ters ? : ");
        String cevap = input.nextLine();


        if (cevap.equals("düz")) {

            System.out.println("MERHABA BU PROGRAM İLE İSTEDİĞİNİZ BOYUTTA DÜZ PİRAMİT OLUŞTURABİLİRSİNİZ!!");
            System.out.print("Boyut giriniz: ");
            int n = input.nextInt();

            if (n > 3) {
                System.out.println("\n\n\n ");

                int bosluk = n - 1;
                String spc = " ";
                String str = "*";
                int k = 1;
                for (int i = 0; i <= n; i++) {
                    System.out.print(spc.repeat(bosluk));
                    System.out.println(str.repeat(k));
                    k = k + 2;
                    bosluk = bosluk - 1;
                    if (bosluk <= 0) {
                        break;
                    }
                }
                System.out.println("\n   Pyramit by ozaki99   ");
            } else {
                System.out.println("\n\n\nHATA\nLütfen 3'ten büyük bir sayı giriniz!");
            }
        } else if (cevap.equals("ters")) {

            System.out.println("MERHABA BU PROGRAM İLE İSTEDİĞİNİZ BOYUTTA TERS PİRAMİT OLUŞTURABİLİRSİNİZ!!");
            System.out.print("Boyut giriniz: ");
            int size = input.nextInt();

            System.out.println("\n\n\n");
            if (size > 3) {
                String spc = " ";
                String str = "*";
                int xb = 1, xy = ((size * 2) - 1);
                int copy = size;

                for (int i = 1; i <= size; i++) {
                    System.out.print(spc.repeat(xb - 1));
                    xb++;
                    System.out.println(str.repeat((copy * 2) - 1));
                    copy--;
                }
                System.out.println("\n   Pyramit by ozaki99   ");
            } else {
                System.out.println("HATA!\nLütfen 3'ten büyük bir sayı giriniz...");
            }
        } else {
            System.out.println("HATA!\nLütfen belirtilen cevaplardan birini giriniz...");
        }
    }
}








    /*
    n = 5 ise
              yükseklik      yıldız        boşluk

    *********    5             9              0
     *******     4             7              1
      *****      3             5              2
       ***       2             3              3
        *        1             1              4  --> n-1
    */