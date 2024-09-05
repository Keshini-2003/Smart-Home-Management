public class SecuritySystem extends Device {
    public SecuritySystem(String name) {
        super(name);
    }

    @Override
    public void deviceType() {
        System.out.println("This is a Security System.");
    }
}
