public class Circle {
    public double radius;
    public String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    public double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}

class TestCylinder{
    public static void main(String[] args) {
        Cylinder cl = new Cylinder(2.0, "black", 5.0);
        System.out.println("Radius is " + cl.getRadius());
        System.out.println("Color is " + cl.getColor());
        System.out.println("Height is " + cl.getHeight());
        System.out.println("Area is " + cl.getArea());
        System.out.println("Volume is " + cl.getVolume());
    }
}