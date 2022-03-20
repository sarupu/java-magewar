import java.util.ArrayList;

public class WaterMagik extends Magik {
    public static ArrayList<WaterMagik> waterMagiks = new ArrayList<>();

    public WaterMagik(String name, int damage, int manaCost, double castTime) {
        super(name, damage, manaCost, castTime);
        waterMagiks.add(this);
    }

}
