public class LightningMagik extends Magik {

    public LightningMagik(String name, int damage, int manaCost, double castTime) {
        super(name, damage, manaCost, castTime);
        MyFirstApp.spellList.add(this);
    }
}
