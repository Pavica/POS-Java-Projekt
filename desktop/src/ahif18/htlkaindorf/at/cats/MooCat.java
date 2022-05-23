package ahif18.htlkaindorf.at.cats;

public class MooCat extends SingleTargetCat{
    //upgrade range and speed
    public MooCat(float x, float y) {
        super(x, y);
    }

    @Override
    public float getBaseDamage() {
        return 200;
    }

    @Override
    public float getBaseAttackInterval() {
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
    public float getBaseRangeWidth() {
        return 200;
    }

    @Override
    public float getBaseRangeHeight() {
        return 200;
    }

    @Override
    public float getDamageMultiplierHelp() {
        return 0.1f;
    }

    @Override
    public float getAttackIntervalMultiplierHelp() {
        return 0.15f;
    }

    @Override
    public float getRangeMultiplierHelp() {
        return 0.2f;
    }

    @Override
    public float getBaseRangeUpgradeCost() {
        return 100;
    }

    @Override
    public float getBaseDamageUpgradeCost() {
        return 100;
    }

    @Override
    public float getBaseAttackIntervalUpgradeCost() {
        return 100;
    }

    @Override
    public void upgradeOne() {
        setRangeLevel(getRangeLevel()+1);
    }

    @Override
    public void upgradeTwo() {
        setAttackIntervalLevel(getAttackIntervalLevel()+1);
    }

    @Override
    public int getOne() {
        return getRangeLevel();
    }

    @Override
    public int getTwo() {
        return getAttackIntervalLevel();
    }

    @Override
    public float getOneCost() {
        return getRangeUpgradeCost();
    }

    @Override
    public float getTwoCost() {
        return getAttackIntervalUpgradeCost();
    }

    @Override
    public String getOneName() {
        return names.Range.name();
    }

    @Override
    public String getTwoName() {
        return names.Speed.name();
    }


}
