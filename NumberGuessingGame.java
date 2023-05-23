import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Bu sınıf random sayı üretmemizi sağlar

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);

        int number = rn.nextInt(0, 100);
        //also int number = (int) (Math.random() * 100);

        System.out.println("\nSayı tahmin oyununa hoş geldiniz...\n0 ile 100 Arası Bir Sayı\n5 Hakkınız var\n");

        int[] tahminler = new int[5];
        int right = 5;
        int cevap;
        boolean hatali = false;
        int hata = 0;
        while(right > 0 || hata < 3){
            System.out.print("Tahmininizi giriniz: ");
            cevap = input.nextInt();

            if(cevap < 0 || cevap > 100){

                if(hata==2){
                    System.out.println("Çok fazla hatalı giriş yaptınız!!!");
                    break;
                }

                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
                hata++;

                continue;
                //Direkt başa dönüyor
            }
            if(cevap == number){
                System.out.println("\nTebrikler, doğru cevap... " + number);
                break;
            }else{
                if(cevap < number){
                    System.out.println("Yanlış cevap: " + cevap + " < " + " ? ");
                }else{
                    System.out.println("Yanlış cevap: " + cevap + " > " + " ? ");
                }
                tahminler[5 - right] = cevap;
                right--;
                System.out.println("Yapılan tahminler: " + Arrays.toString(tahminler));
                System.out.println("Kalan hak: " + right + "\n");
            }
        }
        if(right == 0){
            System.out.println("\nDoğru cevap " + number + "\nGelecek sefere bol şans...");
        }

    }
}
