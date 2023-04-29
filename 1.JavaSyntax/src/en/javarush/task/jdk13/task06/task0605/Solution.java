package en.javarush.task.jdk13.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Controlling body weight
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double BMI = weight / (height * height);
            if (BMI < 18.5) System.out.println("Underweight: BMI < 18.5");
            else if (18.5 <= BMI && BMI <= 25) System.out.println("Normal: 18.5 <= BMI < 25");
            else if (25 <= BMI && BMI <= 30) System.out.println("Overweight: 25 <= BMI < 30");
            else if (BMI > 30) System.out.println("Obese: BMI >= 30");
        }
    }
}
