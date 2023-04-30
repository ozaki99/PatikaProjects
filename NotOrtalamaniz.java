import java.util.Scanner;

public class NotOrtalamaniz {
    public static void main(String[] args) {



        int java,html,css,python,php,sql;
        Scanner tus = new Scanner(System.in);



        System.out.print("Java Notunuz: ");
        java = tus.nextInt();

        System.out.print("HTML Notunuz: ");
        html = tus.nextInt();

        System.out.print("CSS Notunuz: ");
        css = tus.nextInt();

        System.out.print("Python Notunuz: ");
        python = tus.nextInt();

        System.out.print("PHP Notunuz: ");
        php = tus.nextInt();

        System.out.print("SQL notunuz: ");
        sql = tus.nextInt();

        int toplam = (java + html + css + python + php + sql);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: " + sonuc);



        String str = (sonuc > 50) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(str);
    }
}
