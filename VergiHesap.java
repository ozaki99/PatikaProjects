import java.util.Scanner;

public class VergiHesap {
    public static void main(String[] args) {

        double maas,kdvOran= 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Alacağınız Ürünün Fiyatını Girin: ");
        maas = input.nextDouble();

        double kdvTutar = maas * kdvOran;

        double kdvMaas = maas + kdvTutar;
        System.out.println("Vergisiz Halde: " + maas);
        System.out.println("Vergi Oranı: " + kdvOran);
        System.out.println("Vergi Tutarı: " + kdvTutar);
        System.out.println("Vergili Halde: " + kdvMaas);



        double para,paraustu;
        Scanner inp = new Scanner(System.in);

        System.out.println("Ürünü vergiler dahil alıyorsunuz!");
        System.out.print("Ödeyeceğiniz para miktarını girin: ");
        para = inp.nextDouble();

        paraustu = kdvMaas - para;
        System.out.println("Para Üstü: " + paraustu + " TL");
        System.out.println("İyi günler dileriz...");
    }
}
