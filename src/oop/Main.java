package oop;

public class Main {
    public static void main(String[] args) {
        SmartDevice GalaxyWatch = new SmartWatch("Samsung", "4", true, 3, 10);
        SmartDevice GalaxyFold = new SmartPhone("Samsung", "Z4", true,17, 10);
        System.out.println(GalaxyWatch);
        System.out.println(GalaxyFold);
    }
}
