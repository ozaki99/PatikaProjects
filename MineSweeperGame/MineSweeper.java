package MineSweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int row, col;
    String[][] mineMap;
    String[][] board;
    int sayac = 0;
    int rowNo, colNo;
    boolean win;
    boolean durum;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineMap = new String[row][col];
        this.board = new String[row][col];
        fill(this.board);
        fill(this.mineMap);
    }

    public void randomSayi() {
        Random rn = new Random();
        this.rowNo = rn.nextInt(this.row);

        Random rn2 = new Random();
        this.colNo = rn2.nextInt(this.col);
    }

    public String[][] fill(String[][] dizi) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                dizi[i][j] = " - ";
            }
        }
        return dizi;
    }

    public boolean isFind(String[][] arr, String value) {
        if (arr[this.rowNo][colNo] == " * ") {
            return false;
        }
        return true;
    }

    public void run() {
        for (int j = 0; j < this.row; j++) {
            for (int k = 0; k < this.col; k++) {
                if (sayac < (this.col * this.row / 4)) {
                    randomSayi();
                    sayac++;
                    if (isFind(this.board, " * ")) {
                        this.mineMap[rowNo][colNo] = " * ";
                        this.board[rowNo][colNo] = " * ";
                    } else sayac--;
                }
            }
        }
        printMineMap();
        fill(this.board);
        printBoard();
        koordinatGir();

    }

    int durumSayac = 0;

    public void koordinatGir() {
        this.durum = true;
        while (this.durum) {
            int sayac = 0;
            this.durumSayac++;
            boolean kontrol = true;
            int row = 0;
            int col = 0;
            while (kontrol) {
                System.out.print("Satır Giriniz : ");
                row = input.nextInt();
                System.out.print("Sütun Giriniz : ");
                col = input.nextInt();
                if ((row < 0 || row > (this.row - 1)) || (col < 0 || col > (this.col - 1))) {
                    System.out.println("Hatalı sayı girdiniz lütfen tekrar giriniz ");
                    kontrol = true;
                } else {
                    kontrol = false;
                }
            }
            System.out.println("===========================");
            if (this.mineMap[row][col].equals(" * ")) {
                System.out.println("Kaybettin ! ");
                printMineMap();
                this.durum = false;
                break;
            }
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if ((row + i >= 0 && (row + i) <= (this.row - 1)) && (col + j >= 0 && (col + j) <= (this.col - 1))) {
                        if (this.mineMap[row + i][col + j].equals(" * ")) {
                            sayac++;
                            this.board[row][col] = String.valueOf(" " + sayac + " ");
                        }
                        if (sayac == 0) {
                            this.board[row][col] = " 0 ";
                        }
                    }
                }
            }
            if (this.durumSayac == this.row * this.col - (this.col * this.row / 4)) {
                this.win = true;
            }
            if (this.win == true) {
                this.durum = false;
                System.out.println("KAZANDINIZ !!!");
            } else durum = true;
            printBoard();

        }
    }

    public void printMineMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print("   " + this.mineMap[i][j]);
            }
            System.out.println("   ");
        }
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
    }

    public void printBoard() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print("   " + this.board[i][j]);
            }
            System.out.println("   ");
        }
    }

    public void MineCheck(int rowNo, int colNo) {
        this.row = rowNo;
        this.col = colNo;
    }
}