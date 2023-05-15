package BoxGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int block;

    Fighter(String name, int damage, int health, int weight, int block) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
            if (block >= 0 && block <= 100){
                this.block = block;
            } else{
                this.block = 0;
        }
    }

    int hit(Fighter enemy) {
        System.out.println(this.name + " --> " + enemy.name + "'a " + this.damage + " hasar vurdu. ");
        if (enemy.isDodge()) {
            System.out.println("BLOKE!!");
            return enemy.health;
        }
        if (enemy.health - this.damage < 0) {
            return 0;
        }
        return enemy.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.block;
        //Bu math sınıfı random sayı üretmemizi sağlar
    }
}
