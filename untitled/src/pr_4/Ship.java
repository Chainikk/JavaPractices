package pr_4;

class Ship extends Transport {
    public Ship(String name, int passenger, int cargo, double fuel) {
        super(name, passenger, cargo, fuel);
    }
    @Override
    public double Pass_Price(double distance) {
        return passenger * distance * fuel;
    }
    @Override
    public double Cargo_Price(double distance) {
        return cargo * distance * fuel;
    }
    @Override
    public double TimeRequired(double distance) {
        return distance / 30;
    }
    @Override
    public String toString() {
        return "Car {" + name + "}";
    }
}
