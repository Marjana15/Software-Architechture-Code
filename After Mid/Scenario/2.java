import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class CompoundShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a compound shape:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

class TwoTest 
{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        CompoundShape compoundShape = new CompoundShape();
        compoundShape.addShape(circle);
        compoundShape.addShape(rectangle);

        compoundShape.draw();
    }
}
