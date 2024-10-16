package Car_Engine;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Car MercedesBenz = new Car("6.0L V12");
        MercedesBenz.startCar();

        System.out.println("");

        Car McLaren = new Car("3.5L V8");
        McLaren.startCar();

        System.out.println("");

        Car Porsche = new Car("3.4L V8");
        Porsche.startCar();

        System.out.println("");

        Car Volkswagen = new Car("6.0L W6");
        Volkswagen.startCar();

        System.out.println("");

        Car Dodge = new Car("8.0L V10");
        Dodge.startCar();
    }
}
