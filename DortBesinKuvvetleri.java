import java.util.Scanner;

public class DortBesinKuvvetleri {
    public static void main(String[] args) {

        int num;
        int multi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        multi = input.nextInt();

        for (num = 1; num <= multi; num *= 4){
            System.out.println(num);
        }
        System.out.println("------------");
        for (num = 1; num <= multi; num *= 5){
            System.out.println(num);
        }


            // aslında 5 yerine 8 yazarak 8in kuvvetlerini de alabiliriz
            //Ayrıca num *= 5 demek num = num * 5 demektir
            //num*=5 i parantezin içine yazdığımızda çıkan sonucla buraya yazdığımızda çıkan sonuç farklı olacaktır.





    }
}
