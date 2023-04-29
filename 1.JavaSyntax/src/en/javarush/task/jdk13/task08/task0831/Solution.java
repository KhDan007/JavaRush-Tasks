package en.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        BoardGame checkers = new BoardGame();
        checkers.name = "Meow";
        collection[1] = checkers;

        BoardGame game2 = new BoardGame();
        game2.name = "Game 2";
        collection[2] = game2;

        BoardGame game3 = new BoardGame();
        game3.name = "Game 3";
        collection[3] = game3;

        BoardGame game4 = new BoardGame();
        game4.name = "Game 4";
        collection[4] = game4;

        System.out.println(Arrays.toString(collection));
    }
}