public class ArrayLetterPrinter {
    public static void main(String[] args) {


        /*       Z PATTERN
                * * * * *
                      *
                    *
                  *
                * * * * *
         */
        String[][] harf = new String[5][5];

        for (int i = 0; i < harf.length; i++) {
            for (int k = 0; k < harf[i].length; k++) {
                if (i == 0 || i == 4) {
                    harf[i][k] = "* ";
                }else if(i == 1 && k == 3){
                    harf[i][k] = "* ";
                }else if(i == 2 && k == 2){
                    harf[i][k] = "* ";
                }else if(i == 3 && k == 1) {
                    harf[i][k] = "* ";
                }else{
                    harf[i][k] = "  ";
                }
            }
        }
        for (String[] row:harf){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}