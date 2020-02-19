package kg.geektech.game.players;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.SAVE_DAMAGE_AND_REVERT)) {
                boss.setHealth(boss.getHealth() - (heroes[1].getDamage() + boss.getDamage()));
                System.out.println(heroes[1].getDamage() + " + " + boss.getDamage());
                break;
            }
        }
    }
}
