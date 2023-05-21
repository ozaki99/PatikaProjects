import java.util.Arrays;
import java.util.Scanner;

public class ArrayRepeatingNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bu program random bir array oluşturacak\nve array içinde tekrar eden sayıları gösterecek\n");
        System.out.print("Array boyutu girin: ");

        int[] array = new int[input.nextInt()];



        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 9) + 1;
            array[i] = random;
        }



        System.out.println("Oluşturuldu.\n" + Arrays.toString(array));
        Arrays.sort(array);


        int kacKere = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        kacKere++;
                    }
                }
                if (kacKere == 1) {

                    kacKere = 0;
                } else {
                    System.out.println(array[i] + " sayısı " + kacKere + " defa tekrar ediyor.");
                    kacKere = 0;
                }
            } else {
                if (array[i] == array[i + 1]) {

                } else {
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            kacKere++;
                        }
                    }
                    if (kacKere == 1) {
                        kacKere = 0;
                    } else {
                        System.out.println(array[i] + " sayısı " + kacKere + " defa tekrar ediyor.");
                        kacKere = 0;
                    }
                }
            }
        }
    }
}

