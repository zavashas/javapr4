abstract class Figure {
    public abstract double S();
    public abstract double P();
}
class Square extends Figure {
    private double a;
    public Square(double a)
    {
        this.a = a;
    }
    public double S() {
        return a * a;
    }
    public double P() {
        return 4 * a;
    }
}
class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double S() {
        return a * b;
    }
    public double P() {
        return 2 * (a + b);
    }
}
class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double S() {
        return Math.PI * radius * radius;
    }
    public double P() {
        return 2 * Math.PI * radius;
    }
}
