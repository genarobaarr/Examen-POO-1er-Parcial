package Car_Engine;

public class Car {

    private Engine engine;

    public Car(String engineType) {

        this.engine = new Engine(engineType);

    }

    public void startCar() {

        System.out.println("Encendiendo carro...");

        engine.start();

    }

}
