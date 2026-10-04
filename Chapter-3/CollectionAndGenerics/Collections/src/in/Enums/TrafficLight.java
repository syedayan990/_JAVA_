package in.Enums;

public enum TrafficLight {
    RED("Stop"),
    YELLOW("Caution"),
    GREEN("Start");


    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
