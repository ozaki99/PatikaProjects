import java.util.Scanner;

public class HipotenusBul {
    public static void main(String[] args) {
     int aKare, bKare;
     double cKare;


        Scanner deger = new Scanner(System.in);

        System.out.println("Hipotenüs Hesaplayıcı Hoşgeldiniz");
        System.out.print("A kenar uzunluğunu giriniz: ");
        aKare = deger.nextInt();

        System.out.print("B kenar uzunluğunu giriniz: ");
        bKare = deger.nextInt();


        cKare = Math.sqrt((aKare*aKare)+(bKare*bKare));
        //math sınıfı matematik işlemleri içindir sqrt ise karekök almamızı sağlar


        System.out.print("Hipotenüs = " + cKare);

    }
}
