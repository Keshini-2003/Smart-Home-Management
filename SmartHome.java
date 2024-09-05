import java.util.HashMap;
import java.util.Map;

public class SmartHome {
    private Map<String, Device> devices;

    public SmartHome() {
        devices = new HashMap<>();
    }

    public void addDevice(Device device) {
        devices.put(device.getName(), device);
        System.out.println("Device " + device.getName() + " added.");
    }

    public void controlDevice(String name, boolean turnOn) {
        Device device = devices.get(name);
        if (device != null) {
            if (turnOn) {
                device.turnOn();
            } else {
                device.turnOff();
            }
        } else {
            System.out.println("Device " + name + " not found.");
        }
    }

    public void showDeviceStatus() {
        for (Device device : devices.values()) {
            String status = device.isOn() ? "ON" : "OFF";
            System.out.println(device.getName() + " is " + status);
        }
    }
}
