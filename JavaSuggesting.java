import java.util.Scanner;

public class JavaSuggesting {
    public static void main(String[] args) {

        /* Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        int hava;
        Scanner input = new Scanner(System.in);


        System.out.print("*Hello I'm Java\n*Can you type today's temperature: ");
        hava = input.nextInt();


        if (hava < -29) {
            System.out.println("*Java Says: You're in another world");
        } else if (hava <= -10) {
            System.out.println("*Java Suggests: Stay at home and turn on the heater");
        }
        if ((hava > -9) && (hava <= 5)) {
            System.out.println("*Java Suggests: Ski");
        }
        if ((hava >= 5) && (hava <= 25)) {
            System.out.println("*Java Suggests: Cinema");
        }
        if ((hava >= 15) && (hava <= 25)) {
            System.out.println("*Java Suggests: Picnic");
        }
        if ((hava > 25) && (hava < 50)) {
            System.out.println("*Java Suggests: Swimming");
        } else if (hava >= 50) {
            System.out.println("*Java Suggests: Hell");
        }
        System.out.println("*Java: Have a nice day");


    }
}
