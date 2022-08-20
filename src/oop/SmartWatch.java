package oop;

public class SmartWatch extends SmartDevice {
    public SmartWatch(String manufacturer, String model, boolean connected, int screenSize, int brightness) {
        super(manufacturer, model, connected, screenSize, brightness);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", connected=" + connected +
                ", screenSize=" + screenSize +
                ", brightness=" + brightness +
                '}';
    }
}
