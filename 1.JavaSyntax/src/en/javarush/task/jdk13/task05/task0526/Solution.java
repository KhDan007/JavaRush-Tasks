package en.javarush.task.jdk13.task05.task0526;

/* 
Man and woman
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Bro1", 20, "lolkek1");
        Man man2 = new Man("Br02", 22, "lolkek2");
        Woman woman1 = new Woman("Brah1", 18, "keklol1");
        Woman woman2 = new Woman("Brah2", 17, "keklol2");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
