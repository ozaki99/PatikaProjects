import java.util.Scanner;
import java.util.Arrays;


public class ArrayOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nKaç elemanlı dizi oluşturmak istiyorsunuz ?: ");
        int sayi = input.nextInt();

        if (sayi <= 0) {
            System.out.println("Hata alırsın demedi deme..");
        } else {
            int[] dizi = new int[sayi];
            System.out.println();
            System.out.print("Dizi elemanlarını girin\n");
            for (int i = 0, k = 1; i < dizi.length; i++) {
                System.out.print(k + ". Elemanı: ");
                dizi[i] = input.nextInt();
                k++;
            }
            Arrays.sort(dizi);
            System.out.println("Sıralama:\n" + Arrays.toString(dizi));
        }
    }
}
