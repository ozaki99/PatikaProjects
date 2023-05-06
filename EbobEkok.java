import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();


        int i = n1;
        while (i >= 1) {
            i--;
            if (n1 % i == 0 && n2 % i == 0) {
                int ekok = (n1 * n2)/i;
                System.out.println("EBOB = " + i);
                System.out.println("EKOK = " + ekok);
                break;
            }
        }
    }
}
/*
18 24 2
9 12  2
9 6   2
9 3   3
3 1   3
1 1   1

 */