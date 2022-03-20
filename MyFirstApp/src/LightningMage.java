import java.util.ArrayList;
import java.util.Collections;

public class LightningMage extends Mage {

    public LightningMage(String name, int intelligence, int strength, int haste, int maxHealth, int knownSpellCount) {
        super(name, intelligence, strength, haste, maxHealth, knownSpellCount);
        knownSpellGenerator();
    }
    void knownSpellGenerator(){
        ArrayList<Magik> aaa = new ArrayList<>();
        aaa.addAll(LightningMagik.lightningMagiks);
        Collections.shuffle(MyFirstApp.spellList);
        aaa.addAll(MyFirstApp.spellList.subList(0, getKnownSpellCount()));
        Collections.shuffle(aaa); ;
        knownSpells.addAll(aaa);

    }
}
