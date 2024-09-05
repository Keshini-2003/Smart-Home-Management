public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C.");
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void deviceType() {
        System.out.println("This is a Thermostat.");
    }
}
