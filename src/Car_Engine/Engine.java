package Car_Engine;

class Engine {

    private String type;

    public Engine(String type) {

        this.type = type;

    }

    public String getType() {

        return type;

    }

    public void start() {

        System.out.println("Motor " + type + " encendido");

    }

}
