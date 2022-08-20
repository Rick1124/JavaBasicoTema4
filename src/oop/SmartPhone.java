package oop;

public class SmartPhone extends SmartDevice {
    public SmartPhone(String manufacturer, String model, boolean connected, int screenSize, int brightness) {
        super(manufacturer, model, connected, screenSize, brightness);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", connected=" + connected +
                ", screenSize=" + screenSize +
                ", brightness=" + brightness +
                '}';
    }
}
