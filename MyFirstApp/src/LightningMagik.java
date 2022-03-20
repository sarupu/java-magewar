import java.util.ArrayList;

public class LightningMagik extends Magik {
    public static ArrayList<LightningMagik> lightningMagiks = new ArrayList<>();

    public LightningMagik(String name, int damage, int manaCost, double castTime) {
        super(name, damage, manaCost, castTime);
        lightningMagiks.add(this);
    }
}
