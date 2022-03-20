import java.math.MathContext;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class MyFirstApp {
    public static ArrayList<Magik> spellList = new ArrayList<>();
    public static ArrayList<Mage> mageList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner pauser = new Scanner(System.in, "UTF-8");
        Random rng = new Random();
        //Mister White Yo

        FireMagik fireball = new FireMagik("fireball", 8, 65, 0.65);
        LightningMagik jumpstart = new LightningMagik("jumpstart", -10, 1, 5.00);
        LightningMagik shock = new LightningMagik("shock", 5, 50, 0.30);
        FireMagik burst = new FireMagik("burst", 5, 50, 0.45);
        //System.out.println(fire.damage);
        //fireball.cast(8);

        /*while (true) {
            deneme.add(spellList.get(rng.nextInt(spellList.size())));
            ArrayList<Magik> deneme2 = new ArrayList<>();
            deneme2.add(spellList.get(rng.nextInt(spellList.size())));
            while (deneme.contains(deneme2.get(0))) {
                deneme2.clear();
                deneme2.add(spellList.get(rng.nextInt(spellList.size())));
            }
            deneme.add(deneme2.get(0));
            return  deneme;
        }*/

        WaterMage merto = new WaterMage("Merto", 9, 4, 6, 100, 2);
        FireMage kamco = new FireMage("Kamco", 7, 6, 2, 75, 4);
        System.out.println(kamco.knownSpells);
        LightningMage cado = new LightningMage("Cado", 8, 5, 8, 105, 4);
        WandererMage sarupu = new WandererMage("Sarupu", 7, 6, 10, 110, 4);

//        System.out.println(mageList.get(0).getName());
        /*Magik rngSpell = spellList.get(rng.nextInt(spellList.size()));
        Magik rngSpell2 = spellList.get(rng.nextInt(spellList.size()));*/

        System.out.println(String.format(new String("İki büyücü çıktı meydane, kim gelecek diğerinin hakkından acabe?\nSavaş başlasın."), "UTF-8"));

        ArrayList<Mage> fightingMages = Mage.mageSelector();
//        fightingMages.add(mageList.get(rng.nextInt((mageList.size()))));
//        fightingMages.add(mageList.get(rng.nextInt((mageList.size()))));
//        while (fightingMages.get(0).getName().matches(fightingMages.get(1).getName())) {
//            fightingMages.remove(1);
//            fightingMages.add(mageList.get(rng.nextInt((mageList.size()))));
//        }
        Mage mage1 = fightingMages.get(0);
        Mage mage2 = fightingMages.get(1);
        while (true) {

            System.out.println("Press enter to continue.");
            pauser.nextLine();

            if (mage1.getHaste() > mage2.getHaste()) {
                mage1.cast(mage2, mage1.getKnownSpells().get(rng.nextInt(mage1.getKnownSpells().size())));
                mage2.cast(mage1, mage2.getKnownSpells().get(rng.nextInt(mage2.getKnownSpells().size())));
                if (mage2.getCurrentHealth() <= 0 || mage1.getCurrentHealth() <= 0) {
                    break;
                }
            }
            else {
                mage2.cast(mage1, mage2.getKnownSpells().get(rng.nextInt(mage2.getKnownSpells().size())));
//                System.out.println(mage2.getknownSpells());
                mage1.cast(mage2, mage1.getKnownSpells().get(rng.nextInt(mage1.getKnownSpells().size())));
            }
                if (fightingMages.get(0).getCurrentHealth() <= 0 || mage2.getCurrentHealth() <= 0) {
                    break;
            }

        }
    }
}



