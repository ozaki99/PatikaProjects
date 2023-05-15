package BoxGame;

public class Showdown {
    Fighter man1;
    Fighter man2;
    int minWeight;
    int maxWeight;

    Showdown(Fighter man1, Fighter man2, int minWeight, int maxWeight) {
        this.man1 = man1;
        this.man2 = man2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isWin() {
        if (this.man1.health == 0) {
            System.out.println("Karşılaşma Bitti...\nKAZANAN ===> " + this.man2.name);
            return true;
        }
        if (this.man2.health == 0) {
            System.out.println("Karşılaşma Bitti...\nKAZANAN ===> " + this.man1.name);
            return true;
        }
        return false;
    }

    boolean isCheck() {
        return (this.man1.weight <= maxWeight && this.man1.weight >= minWeight) && (this.man2.weight <= maxWeight && this.man2.weight >= minWeight);
    }


    int startChance = 50;

    //50 altı man1 50 üstü man2 başlar
    void run() {
        if (isCheck()) {

            double startNum = Math.random() * 100;
            if (startNum > startChance) {

                System.out.println("İLK SALDIRI " + this.man1.name + "'IN\n");

                while (this.man1.health > 0 && this.man2.health > 0) {

                    this.man2.health = this.man1.hit(this.man2);
                    System.out.println(this.man2.name + " sağlığı = " + this.man2.health);

                    if (isWin()) {
                        break;
                    }
                    this.man1.health = this.man2.hit(this.man1);
                    System.out.println(this.man1.name + " sağlığı = " + this.man1.health);

                    if (isWin()) {
                        break;
                    }

                    System.out.println();
                    System.out.println("====================================================");

                }
            }
            if (startNum < startChance) {

                System.out.println("İLK SALDIRI " + this.man2.name + "'IN");


                while (this.man1.health > 0 && this.man2.health > 0) {

                    this.man1.health = this.man2.hit(this.man1);
                    System.out.println(this.man1.name + " sağlığı = " + this.man1.health);

                    if (isWin()) {
                        break;
                    }
                    this.man2.health = this.man1.hit(this.man2);
                    System.out.println(this.man2.name + " sağlığı = " + this.man2.health);

                    if (isWin()) {
                        break;
                    }

                    System.out.println();
                    System.out.println("====================================================");

                }

            }


        } else {
            System.out.println("Sporcuların ağırlığı birbiriyle uyumsuz!!");
        }
    }


}
