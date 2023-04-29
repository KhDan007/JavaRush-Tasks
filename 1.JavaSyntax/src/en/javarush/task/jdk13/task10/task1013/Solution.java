package en.javarush.task.jdk13.task10.task1013;

/* 
Human class constructors
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String address;
        private float weight;
        private double height;
        private String profession;

        public Human(String name, int age, String address, float weight, double height, String profession) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.weight = weight;
            this.height = height;
            this.profession = profession;
        }
        public Human(float weight) {
            this.weight = weight;
        }
        public Human(double height) {
            this.height = height;
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String address, float weight) {
            this.address = address;
            this.weight = weight;
        }
        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Human(String name, int age, String address, float weight) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.weight = weight;
        }
        public Human(String name, int age, String address, float weight, double height) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.weight = weight;
            this.height = height;
        }
        public Human(String address, float weight, double height) {
            this.address = address;
            this.weight = weight;
            this.height = height;
        }
        public Human(int age, float weight, double height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
