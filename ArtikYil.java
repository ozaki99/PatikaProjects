import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Artık olup olmadığını görmek için yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0){
            System.out.println(yil + " artık yıldır");
        }else{
            System.out.println(yil + " artık yıl değildir");
        }

    }
}
