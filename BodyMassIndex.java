import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)
        */

        int weight;
        double lenght;
        double bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz (KG): ");
        weight = input.nextInt();

        System.out.print("Lütfen boyunuzu girin (M,CM): ");
        lenght = input.nextDouble();

        bmi = (weight / (lenght * lenght));

        System.out.println("BMI Hesaplandı: " + (bmi < 18 ? "Underweight" : (bmi < 25 ? "Normal weight" : (bmi < 35 ? "Overweight" : "Extreme overweight"))));

        //Biraz karmaşık duruyor...
    }
}
