public class Car implements Comparable<Car> {


    String model;
    int year;

    public Car(String model, int year){

        this.model = model;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }


    @Override
    public int compareTo(Car car){

        return Integer.compare(this.year, car.year);
    }

}
