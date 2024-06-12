import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList <Car> cars = new ArrayList<>();

        Car car1 = new Car("CLS", 2021);
        Car car2 = new Car("E36", 2023);
        Car car3 = new Car("GT3RS", 2019);
        Car car4 = new Car("V60", 2009);
        Car car5 = new Car("A3", 2011);
        Car car6 = new Car("MK2", 2005);
        Car car7 = new Car("CORSA", 2011);
        Car car8 = new Car("M3", 2015);
        Car car9 = new Car("RS3", 2017);
        Car car10 = new Car("6.3AMG", 2010);


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        Collections.sort(cars);

        for(Car car : cars) {
                System.out.println(car.getYear());
        }


    }
}