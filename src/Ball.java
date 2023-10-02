public class Ball {
    public String getColor() {
        return color;
    }public void setColor(String color) {
        this.color = color;
    }private String color; private double radius;
    public Ball(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }public double getRadius() {
        return radius;
    }public void setRadius(double radius) {
        this.radius = radius;
    }public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }public String toString() {
        return "A " + color + " ball with a radius of " + radius + " units.";
    }
}

