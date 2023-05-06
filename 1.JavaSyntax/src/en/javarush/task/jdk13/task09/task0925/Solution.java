package en.javarush.task.jdk13.task09.task0925;

/* 
Static modifiers are out of place
*/

public class Solution {
    static public int A = 5;
    static public int B = 2 * A;
    public int C = A * B;
    static public int D = A * B;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
