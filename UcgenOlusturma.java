import java.util.Scanner;

public class UcgenOlusturma {
    public static void main(String[] args) {

        //this code created by ozaki99


        //ikinci denemem
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();

        if (n > 0) {
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
        }else{
            System.out.println("HATA\nLütfen 3'ten büyük bir sayı giriniz!");
        }
    }
}



/*Patika dev algoritması

Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

 */


        /* ilk denemem aşağıda
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin büyüklüğü için sayı girin: ");
        int n = input.nextInt();
        int carpan = n;
        String spc = " ";
        String star = "*";
        int i = 0;

        while (i <= n){
            System.out.print(spc.repeat((carpan/2)-1));
            System.out.println(star.repeat(i+1));
            i++;
            carpan--;
        }
            */

