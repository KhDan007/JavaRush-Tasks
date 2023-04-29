package en.javarush.task.jdk13.task06.task0608;

/* 
Static methods: int getCatCount() and setCatCount(int)
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return Cat.catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
