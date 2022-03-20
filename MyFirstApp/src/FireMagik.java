import java.util.ArrayList;


public class FireMagik extends Magik{
    public static ArrayList<FireMagik> fireMagiks = new ArrayList<>();


    public FireMagik(String name, int damage, int manaCost, double castTime) {
        super(name, damage, manaCost, castTime);
        fireMagiks.add(this);
    }
}
