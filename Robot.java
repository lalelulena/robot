import java.util.Random;

public class Robot {
    private final String name;
    private int battery; // in Prozent
    private int distance; // in Metern

    public Robot(String name) {
        this.name = name;
        this.battery = 100;
        this.distance = 0;
    }

    public void runStep() {
        Random rand = new Random();
        distance += rand.nextInt(10);
        battery -= 5;
    }

    public boolean hasBattery() {
        return battery > 0;
    }

    public String getName() {
        return this.name;
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + name + "'" +
                ", battery='" + battery + "'" +
                ", distance='" + distance + "'" +
                "}";
    }
}