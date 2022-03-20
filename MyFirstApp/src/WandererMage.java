import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WandererMage extends Mage {

    public WandererMage(String name, int intelligence, int strength, int haste, int maxHealth, int knownSpellCount) {
        super(name, intelligence, strength, haste, maxHealth, knownSpellCount);
        knownSpellGenerator();
    }


//    private ArrayList<Magik> spellRandomizer() {
//        int x = 0;
//        deneme.add(MyFirstApp.spellList.get(rng.nextInt(MyFirstApp.spellList.size())));
//        ArrayList<Magik> deneme2 = new ArrayList<>();
//        while (x != knownSpellCount-1) {
//
//            deneme2.add(MyFirstApp.spellList.get(rng.nextInt(MyFirstApp.spellList.size())));
//            while (deneme.contains(deneme2.get(0))) {
//                deneme2.clear();
//                deneme2.add(MyFirstApp.spellList.get(rng.nextInt(MyFirstApp.spellList.size())));
//            }
//            deneme.add(deneme2.get(0));
//            deneme2.clear();
//            x++;
//        }
//        return  deneme;
//    }
     void knownSpellGenerator() {
        ArrayList<Magik> aaa = MyFirstApp.spellList;
        Collections.shuffle(aaa);
        List<Magik> randomSeries = aaa.subList(0, getKnownSpellCount());
        knownSpells.addAll(aaa);
    }
}
