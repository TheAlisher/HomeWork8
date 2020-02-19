package kg.geektech.game.players;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.CRITICAL_DAMAGE)) {
                int min = 2;
                int max = 3;
                int rNum = min + (int) (Math.random() * max);
                boss.setHealth(boss.getHealth() - (heroes[0].getDamage() * rNum));
                System.out.println("Warrior attack: " + heroes[0].getDamage() + " * " + rNum);
                break;
            }
        }
    }
}
