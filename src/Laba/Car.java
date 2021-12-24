package Laba;

public class Car extends Thread {

    private String name;
    private int speed;
    private double distance;
    private double time = 0;

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {
        for (int i = 0; i <= distance; i++) {
            System.out.println(name + " is in " + i + " meters");
        }
        time = distance / speed;
    }

    public double getTime() {
        return time;
    }

    public String getNameCar() {
        return name;
    }
}
