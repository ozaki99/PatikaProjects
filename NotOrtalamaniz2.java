import java.util.Scanner;

public class NotOrtalamaniz2 {
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;


        Scanner input = new Scanner(System.in);

        System.out.println("Ortalama hesaplama için lütfen notlarınızı giriniz");
        System.out.print("Matematik: ");
        mat = input.nextInt();

        System.out.print("Fizik: ");
        fizik = input.nextInt();

        System.out.print("Türkçe: ");
        turkce = input.nextInt();

        System.out.print("Kimya: ");
        kimya = input.nextInt();

        System.out.print("Müzik: ");
        muzik = input.nextInt();

        double sonuc = (mat + fizik + turkce + kimya + muzik) / 5;

        if (sonuc < 0 || sonuc > 100) {
            System.out.println("Bir yerde hatalı giriş yaptınız\nLütfen tekrar deneyin");


        } else if ((sonuc >= 55) && (sonuc <= 100)) {
            System.out.println("Tebrikler!\nSınıfı geçtiniz...");
            System.out.println("Ortalamanız: " + sonuc);


        } else {
            System.out.println("Sınıfta kaldınız!\nSeneye görüşürüz...");
            System.out.println("Ortalamanız: " + sonuc);
        }
    }
}
