package en.javarush.task.jdk13.task05.task0520;

/* 
Populate the Rectangle class
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top) {
        this.top = top;
    }

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
