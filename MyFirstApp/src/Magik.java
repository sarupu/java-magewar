public class Magik {
    private int damage;
    private int manaCost;
    private double castTime;
    private String name;

    public String getName() {return name;}

    public int getDamage() {
        return damage;
    }

    public void setCastTime(double castTime) {
        this.castTime = castTime;
    }

    public Magik(String name, int damage, int manaCost, double castTime) {
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
        this.castTime = castTime;

    }



}

