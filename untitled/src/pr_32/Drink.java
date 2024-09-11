package pr_32;


public final class Drink {
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    public DrinkTypeEnum getType0() {
        return type;
    }
}
