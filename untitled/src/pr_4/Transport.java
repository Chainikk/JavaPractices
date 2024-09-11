package pr_4;

abstract class Transport {
    protected String name;
    protected int passenger;
    protected int cargo;
    protected double fuel;
    public Transport(String name, int passenger, int cargo, double fuel) {
        this.name = name;
        this.passenger = passenger;
        this.cargo = cargo;
        this.fuel = fuel;
    }
    abstract public double Pass_Price(double distance);
    abstract public double Cargo_Price(double distance);
    abstract public double TimeRequired(double distance);
    abstract public String toString();
}
