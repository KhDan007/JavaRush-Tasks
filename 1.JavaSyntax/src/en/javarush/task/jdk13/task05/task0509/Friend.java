package en.javarush.task.jdk13.task05.task0509;

/* 
Populate the Friend class
*/

public class Friend {
    String name;
    int age;
    char sex;

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

    }

}
