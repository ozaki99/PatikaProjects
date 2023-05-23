package MineSweeperGame;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz : ");
        int a = input.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz : ");
        int b = input.nextInt();
        MineSweeper mayin = new MineSweeper(a, b);
        mayin.run();
        System.out.println("   ");
    }
}