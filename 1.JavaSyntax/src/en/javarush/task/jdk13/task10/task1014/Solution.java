package en.javarush.task.jdk13.task10.task1014;

/* 
Use the fewest number of static modifiers
*/

public class Solution {
    public int A = 5;
    static public int B = 5;
    static public int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
