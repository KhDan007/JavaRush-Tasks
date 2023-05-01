package en.javarush.task.jdk13.task07.task0724;

/* 
Family census
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("ded1", true, 70);
        Human grandfather2 = new Human("ded2", true, 72);
        Human grandmother1 = new Human("babka1", false, 68);
        Human grandmother2 = new Human("babka2", false, 70);
        Human father = new Human("bro1", true, 40, grandfather1, grandmother1);
        Human mother = new Human("brah1", false, 38, grandfather2, grandmother2);
        Human child1 = new Human("babe1", true, 5, father, mother);
        Human child2 = new Human("babe2", false, 10, father, mother);
        Human child3 = new Human("babe3", true, 15, father, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
    }

    public static class Human {
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }
}