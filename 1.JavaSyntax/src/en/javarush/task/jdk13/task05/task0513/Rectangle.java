package en.javarush.task.jdk13.task05.task0513;

/* 
Let's put together a rectangle
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(int width) {
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = width;
    }

    public static void main(String[] args) {

    }
}
