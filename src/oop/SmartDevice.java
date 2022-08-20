package oop;

public class SmartDevice {
    String manufacturer;
    String model;
    boolean connected;
    int screenSize;
    int brightness;

    public SmartDevice() {
    }

    public SmartDevice(String manufacturer, String model, boolean connected, int screenSize, int brightness) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.connected = connected;
        this.screenSize = screenSize;
        this.brightness = brightness;
    }
}
