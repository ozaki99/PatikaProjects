import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

        */

        int kArmut, kElma, kDomates, kMuz, kPatlican;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;

        //double kısmı ürünlerin kg fiyatları

        Scanner input = new Scanner(System.in);


        System.out.print("Armut kaç kilo ? : ");
        kArmut = input.nextInt();

        System.out.print("Elma kaç kilo ? : ");
        kElma = input.nextInt();

        System.out.print("Domates kaç kilo ? : ");
        kDomates = input.nextInt();

        System.out.print("Muz kaç kilo ? : ");
        kMuz = input.nextInt();

        System.out.print("Patlıcan kaç kilo ? : ");
        kPatlican = input.nextInt();

        double toplam = (kArmut * armut) + (kElma * elma) + (kDomates * domates) + (kMuz * muz) + (kPatlican * patlican);


        System.out.print("Toplam Tutar: " + toplam);

        //Burada başka bir kullanıcıdan aldığım bu kodun daha kısaltılmış halini görebilirsiniz

        /*

                Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,toplam;

        System.out.print("Armut kaç kilo: ");
        armut=input.nextDouble();
        System.out.print(" Elma kac kilo: ");
        elma=input.nextDouble();
        System.out.print(" Domates kac kilo: ");
        domates=input.nextDouble();
        System.out.print(" Muz kac kilo: ");
        muz=input.nextDouble();
        System.out.print(" Patlican kac kilo: ");
        patlican=input.nextDouble();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.print("Toplam tutar= "+toplam);


        çok da kısa değilmiş ben boşluk kullanmayı seviyorum kod yazmak sanattır

        */

    }
}
