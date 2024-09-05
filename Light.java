public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void deviceType() {
        System.out.println("This is a Light.");
    }
}
