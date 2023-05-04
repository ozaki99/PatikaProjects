import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        int number;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyeli hesaplanacak sayıyı giriniz: ");
        number = input.nextInt();

        //total olarak 1 atıyoruz ki çarpıp totalde toplayalım

        for (int one = 1; one <= number; one++){
            total = total * one;
        }
        System.out.println(number + " Faktöriyel = " + total);
    }
}

//4!  1.2.3.4 = 4!