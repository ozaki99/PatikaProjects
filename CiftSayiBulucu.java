import java.util.Scanner;


public class CiftSayiBulucu {
    public static void main(String[] args) {

        /*
        int key;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz\nProgram 1'den girdiğiniz sayıya kadar olan çift sayıları bulacak\n---> ");
        key = input.nextInt();

        for (int i = 1; i <= key; i++ ){
            if (i % 2 == 0){
                System.out.println(i);
            }else if(key < 2){
                System.out.println("Daha yüksek bir sayı gir!");
                break;
            }
        }
        */


        int baslangic, bitis;
        Scanner input = new Scanner(System.in);

        System.out.print("Başlangıç sayısı girin: ");
        baslangic = input.nextInt();

        System.out.print("Bitiş sayısı girin: ");
        bitis = input.nextInt();


        if (bitis <= baslangic) {
            System.out.println("HATA");
        }else{

            boolean run;


            for (run = true; baslangic <= bitis; baslangic++) {

                if (baslangic % 2 == 0) {
                    System.out.print(baslangic + " ");
                }
            }
        }
    }
}