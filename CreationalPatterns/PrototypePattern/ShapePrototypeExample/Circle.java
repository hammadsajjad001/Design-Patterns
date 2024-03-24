package CreationalPatterns.PrototypePattern.ShapePrototypeExample;

public class Circle implements Shape {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Shape clone () {
        return new Circle(this.color,this.radius);
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void draw () {
        System.out.println("Drawing Circle with " + color + "color" + "and " + radius + "radius");
    }
}