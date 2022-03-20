import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireMage extends Mage {

    public FireMage(String name, int intelligence, int strength, int haste, int maxHealth, int knownSpellCount){
        super(name, intelligence, strength, haste, maxHealth, knownSpellCount);
        knownSpellGenerator();

    }

    void knownSpellGenerator() {

        ArrayList<Magik> aaa = new ArrayList<>();
        aaa.addAll(FireMagik.fireMagiks);
        Collections.shuffle(MyFirstApp.spellList);
        aaa.addAll(MyFirstApp.spellList.subList(0, getKnownSpellCount()));
        Collections.shuffle(aaa); ;
        knownSpells.addAll(aaa);
    }
}
