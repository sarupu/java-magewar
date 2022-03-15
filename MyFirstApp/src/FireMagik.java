public class FireMagik extends Magik{

    public FireMagik(String name, int damage, int manaCost, double castTime) {
        super(name, damage, manaCost, castTime);
        MyFirstApp.spellList.add(this);
    }
}
