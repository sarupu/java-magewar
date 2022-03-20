import java.util.ArrayList;
import java.util.Collections;

public class WaterMage extends Mage{

    public WaterMage(String name, int intelligence, int strength, int haste, int maxHealth, int knownSpellCount) {
        super(name, intelligence, strength, haste, maxHealth, knownSpellCount);
        knownSpellGenerator();
    }

    void knownSpellGenerator(){
        ArrayList<Magik> aaa = new ArrayList<>();
        aaa.addAll(WaterMagik.waterMagiks);
        Collections.shuffle(MyFirstApp.spellList);
        aaa.addAll(MyFirstApp.spellList.subList(0, getKnownSpellCount()));
        Collections.shuffle(aaa); ;
        knownSpells.addAll(aaa);

    }
}
