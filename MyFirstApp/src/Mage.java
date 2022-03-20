import java.util.ArrayList;
import java.util.Random;

public abstract class Mage {
    private String name;
    private int intelligence;
    private int strength;
    private int haste;
    private int maxHealth;
    private int currentHealth;
    private int knownSpellCount;
    ArrayList<Magik> knownSpells = new ArrayList<>();
    abstract void knownSpellGenerator();


    public void setKnownSpells(ArrayList<Magik> knownSpells) {
        this.knownSpells.clear();
        this.knownSpells.addAll(knownSpells);
    }
    public ArrayList<Magik> getKnownSpells() {
        return knownSpells;
    }
    public String getName() {return name;}
    public int getHaste() {
        return haste;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public int getKnownSpellCount() {
        return knownSpellCount;
    }

    public Mage(String name, int intelligence, int strength, int haste, int maxHealth, int knownSpellCount) {
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.haste = haste;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.knownSpellCount = knownSpellCount;
//        this.knownSpells = spellRandomizer();
        MyFirstApp.mageList.add(this);
    }
    public void cast(Mage target, Magik spell) {
        if (spell.getName().equals("jumpstart")) {
            setCurrentHealth(getCurrentHealth() - spell.getDamage());
            System.out.println(getName() + " cast " + spell.getName() + " to thyself. It healed for " + Math.abs(spell.getDamage()) +
                    ". \n" + getName() + "'s current health is: " + getCurrentHealth() + ".");

        }

        else {
            target.setCurrentHealth(target.getCurrentHealth() - spell.getDamage());
            System.out.println(getName() + " cast " + spell.getName() + " to "
                    + target.getName() + " It damaged for " + spell.getDamage() + ". \n" + target.getName() + "'s current health is: " + target.getCurrentHealth() + ".");
        }
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
    public static ArrayList<Mage> mageSelector() {
        ArrayList<Mage> mages = new ArrayList<>();
        mages.add(MyFirstApp.mageList.get(rng.nextInt((MyFirstApp.mageList.size()))));
        mages.add(MyFirstApp.mageList.get(rng.nextInt((MyFirstApp.mageList.size()))));
        while (mages.get(0).getName().equals(mages.get(1).getName())) {
            mages.remove(1);
            mages.add(MyFirstApp.mageList.get(rng.nextInt((MyFirstApp.mageList.size()))));
        }
        return mages;
    }
    static Random rng = new Random();
    ArrayList<Magik> deneme = new ArrayList<>();
}
