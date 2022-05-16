package ahif18.htlkaindorf.at.cats;

public class MooCat extends SingleTargetCat{
    //upgrade range and speed
    public MooCat(float x, float y) {
        super(x, y);
    }

    @Override
    public int getDamage() {
        return 200;
    }

    @Override
    public float getAttackInterval() {
        return 500;
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public int getID() {
        return 3;
    }

    @Override
    public int getRangeWidth() {
        return 200;
    }

    @Override
    public int getRangeHeight() {
        return 200;
    }
}
