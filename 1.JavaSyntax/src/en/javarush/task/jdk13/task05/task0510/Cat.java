package en.javarush.task.jdk13.task05.task0510;

/* 
Initializing cats
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 10;
        this.color = "white";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "white";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "white";
    }
    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 1;
    }
    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
