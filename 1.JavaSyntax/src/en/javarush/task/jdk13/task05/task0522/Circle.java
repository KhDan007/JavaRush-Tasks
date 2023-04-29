package en.javarush.task.jdk13.task05.task0522;

/* 
Max constructors
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    public Circle(double x) {
        this.x = x;
    }
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}