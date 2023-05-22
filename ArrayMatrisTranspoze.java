import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayMatrisTranspoze {
    public static void main(String[] args) {

        int[][] matris = new int[2][3];
        int[][] transpose = new int[3][2];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                int number = (int) (Math.random() * 9);
                matris[i][j] = number;
                transpose[j][i] = number;
            }
        }
        System.out.println("Matris:");
        for (int[] i : matris) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("\nTranspose:");
        for (int[] i : transpose) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
