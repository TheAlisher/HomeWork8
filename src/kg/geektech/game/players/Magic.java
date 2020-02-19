package kg.geektech.game.players;

public class Magic extends Hero {

    private int magicalDamagePlus;

    public Magic(int health, int damage, int magicalDamagePlus) {
        super(health, damage, SuperAbility.BOOST);
        this.magicalDamagePlus = magicalDamagePlus;
    }

    public int getMagicalDamagePlus() {
        return magicalDamagePlus;
    }

    public void setMagicalDamagePlus(int magicalDamagePlus) {
        this.magicalDamagePlus = magicalDamagePlus;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(SuperAbility.BOOST)){
                heroes[i].setDamage(heroes[i].getDamage() + magicalDamagePlus);
                //System.out.println(heroes[i].getClass().getSimpleName() + " damage: " + magicalDamagePlus);
                break;
            }
        }
    }
}
