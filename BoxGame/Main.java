package BoxGame;

public class Main {
    public static void main(String[] args) {


        Fighter man1 = new Fighter("James LeBrown",18,125,98, 35);
        Fighter man2 = new Fighter("Kenny DownBreaker", 21, 105, 89, 15);

        Showdown hesaplasma = new Showdown(man1, man2, 80, 100);
        hesaplasma.run();
    }
}
