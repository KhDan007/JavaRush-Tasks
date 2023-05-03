package en.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
The whole family together
*/

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human();
        child1.name = "Child-1";
        child1.age = 10;
        child1.sex = true;

        Human child2 = new Human();
        child2.name = "Child-2";
        child2.age = 10;
        child2.sex = true;

        Human child3 = new Human();
        child3.name = "Child-2";
        child3.age = 10;
        child3.sex = true;

        Human father = new Human();
        father.name = "Father";
        father.age = 40;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "Mother";
        mother.age = 40;
        mother.sex = false;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human grandfather1 = new Human();
        grandfather1.age = 70;
        grandfather1.sex = true;
        grandfather1.name = "Grandfather-1";
        grandfather1.children.add(father);

        Human grandfather2 = new Human();
        grandfather2.age = 70;
        grandfather2.sex = true;
        grandfather2.name = "Grandfather-2";
        grandfather2.children.add(mother);

        Human grandmother1 = new Human();
        grandmother1.age = 70;
        grandmother1.sex = false;
        grandmother1.name = "Grandmother-1";
        grandmother1.children.add(father);

        Human grandmother2 = new Human();
        grandmother2.age = 70;
        grandmother2.sex = false;
        grandmother2.name = "Grandmother-2";
        grandmother2.children.add(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(mother);
        System.out.println(father);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
