public abstract class Device {
    private String name;
    private boolean status;

    public Device(String name) {
        this.name = name;
        this.status = false; // Default OFF
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return status;
    }

    public void turnOn() {
        this.status = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println(name + " is now OFF.");
    }

    public abstract void deviceType();
}
