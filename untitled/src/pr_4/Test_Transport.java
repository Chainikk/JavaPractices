package pr_4;

import pr_4.Car;
import pr_4.Plane;
import pr_4.Ship;
import pr_4.Train;

public class Test_Transport {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4, 2, 10.5);
        Plane plane = new Plane("Airbus",320,500, 25.3);
        Ship ship = new Ship("Avrora", 1000, 2000, 39.3);
        Train train = new Train("AVE", 600, 300, 20.9);
        System.out.println(car + " Стоимость: " + car.Pass_Price(200) + " Время в пути: " + car.TimeRequired(200) + "ч");
        System.out.println(plane + " Стоимость: " + plane.Cargo_Price(200) + " Время в пути: " + plane.TimeRequired(200) + "ч");
        System.out.println(train + " Стоимость: " + train.Pass_Price(2000) + " Время в пути: " + train.TimeRequired(2000) + "ч");
        System.out.println(ship + " Стоимость: " + ship.Cargo_Price(200) + " Время в пути: " + ship.TimeRequired(200) + "ч");
    }
}
