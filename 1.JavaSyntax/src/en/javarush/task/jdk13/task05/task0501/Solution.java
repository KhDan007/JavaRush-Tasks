package en.javarush.task.jdk13.task05.task0501;

/* 
Cat carnage (1)
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("lol", 3, 10, 50);
        Cat cat2 = new Cat("kek", 1, 20, 100);
        Cat cat3 = new Cat("bruh", 2, 5, 25);

        System.out.println(cat1.fight(cat2));;
        System.out.println(cat2.fight(cat3));;
        System.out.println(cat3.fight(cat1));;
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat cat) {
            int score1 = 0;
            int score2 = 0;
            if (this.age > cat.age) score1++;
            else if (this.age < cat.age) score2++;
            if (this.weight > cat.weight) score1++;
            else if (this.weight < cat.weight) score2++;
            if (this.strength > cat.strength) score1++;
            else if (this.strength < cat.strength) score2++;

            return score1 > score2;
        }
    }
}
