package CreationalPatterns.PrototypePattern.ShapePrototypeExample;

public class MainShape {
    public static void main (String[] args) {
        Shape circle = new Circle("Red",4);
        circle.draw();

        Shape clonedCircle = circle.clone();
        clonedCircle.setColor("Blue");
        clonedCircle.getColor();
        clonedCircle.draw();
    }
}

