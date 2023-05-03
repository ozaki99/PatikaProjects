import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.println("\nMerhaba gireceğiniz 3 sayıyı küçükten büyüğe sıralayabilirim");
        System.out.print("1. sayı: ");
        x = input.nextInt();

        System.out.print("2. sayı: ");
        y = input.nextInt();

        System.out.print("3. sayı: ");
        z = input.nextInt();

        if ((x < y) && (x < z)) {
            if (y < z) {
                System.out.println(x + "<" + y + "<" + z);
            } else {
                System.out.println(x + "<" + z + "<" + y);
            }
        } else if ((y < z) && (y < x)) {
            if (z < x) {
                System.out.println(y + "<" + z + "<" + x);
            } else {
                System.out.println(y + "<" + x + "<" + z);
            }
        } else if ((z < x) && (z < y)) {
            if (x<y){
                System.out.println(z + "<" + x + "<" + y);
            }
        }else{
            System.out.println(z + "<" + y + "<" + x);
        }
    }
}
