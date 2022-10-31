package ExerciseCar;

public class car {
    private String color;
    private String make;
    private int year;
    private String version;

    public car(String color, String make, int year, String version) {
        this.color = color;
        this.make = make;
        this.year = year;
        this.version = version;
    }
//getter
    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getVersion() {
        return version;

    }


    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", version='" + version + '\'' +
                '}';
    }
}
