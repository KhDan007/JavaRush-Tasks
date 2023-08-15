package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/

public class Solution {
    public static class Building {
        public static class Hall {
            private BigDecimal square;

            public Hall() {
            }

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public static class Apartments {
        }
    }

    public class Apt3Bedroom extends Building.Apartments {

    }

    public class BigHall extends Building.Hall {

    }

    public static void main(String[] args) {

    }
}
