import javax.swing.*;
import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {

        //Kullanıcı adı: ozaki99 Parola: yoldas99

        Scanner input = new Scanner(System.in);
        String userName, password;

        int islem;
        int userCash;
        int bakiye = 3898;

        for (int hak = 3; hak > 0; ) {

            System.out.println("\nOZAKIBANK'A HOSGELDINIZ\n");

            System.out.print("Kullanıcı adı: ");
            userName = input.nextLine();

            System.out.print("Parola: ");
            password = input.nextLine();


            if (userName.equals("ozaki99") && password.equals("yoldas99")) {
                System.out.println("\nHoşgeldiniz\n\n");
                do {
                    System.out.println("1-Para Yükleme\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    islem = input.nextInt();
                    System.out.println();

                    switch (islem) {
                        case 1:
                            System.out.print("Lütfen yüklemek istediğiniz miktarı giriniz: ");
                            userCash = input.nextInt();
                            if (userCash > 10000) {
                                System.out.println("Çok büyük bir miktar girdiniz!\n");
                            } else {
                                bakiye += userCash;
                                System.out.println("Para yükleme başarılı\nMevcut bakiyeniz: " + bakiye + "\n");
                            }
                            break;

                        case 2:
                            System.out.print("Lütfen çekmek istediğiniz para miktarınız giriniz: ");
                            userCash = input.nextInt();
                            if (userCash > bakiye) {
                                System.out.println("Yetersiz bakiye!\n");
                            } else {
                                bakiye -= userCash;
                                System.out.println("Mevcut Bakiyeniz: " + bakiye + "\n");
                            }
                            break;

                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + bakiye + "\n");
                            break;
                    }
                } while (islem != 4);
                System.out.println("Hoşçakalın...");
                break;


            } else {
                System.out.println("\nKalan deneme: " + --hak);
            }
            if (hak == 0) {
                System.out.println("Hesabınız bloke olmuştur! Lütfen banka ile iletişime geçin!");
            }
        }
    }
}
