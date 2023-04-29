package en.javarush.task.jdk13.task05.task0517;

/* 
Creating cats
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 10;
        this.color = "white";
    }
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "white";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "white";
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }
    public Cat(int weight, String address, String color) {
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
