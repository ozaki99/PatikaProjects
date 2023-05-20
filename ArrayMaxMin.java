import java.util.Scanner;
import java.util.Arrays;

public class ArrayMaxMin {

    /*
   Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

   Dizi : {15,12,788,1,-1,-778,2,0}
   Girilen Sayı : 5
   Girilen sayıdan küçük en yakın sayı : 2
   Girilen sayıdan büyük en yakın sayı : 12
    */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.print("Bir sayı girin...: ");
        int sayi = input.nextInt();

        int yakinMin;
        int yakinMax;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > sayi) {
                yakinMax = list[i];
                yakinMin = list[i - 1];
                System.out.println("Girilen sayıya yakın en büyük: " + yakinMax);
                System.out.println("Girilen sayıya yakın en küçük: " + yakinMin);
                break;
            }
        }
    }
}
