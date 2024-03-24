package CreationalPatterns.PrototypePattern.ShapePrototypeExample;

public interface Shape {
    Shape clone();
    void setColor(String color);
    String getColor();
    void draw();
}