package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 32;
        int b = 27;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
class Lesson_2 {
    public static void main(String[] args) {
        Task5();
        Task6();
        Task7();
    }

    public static void Task5() {
        System.out.println("Задание 5");
        boolean sumInRange = isSumInRange(3, 9);
        System.out.println("Сумма в диапазоне: " + sumInRange);
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        int s = a + b;
        return (10 <= s) && (s <= 20);
    }

    public static void Task6() {
        System.out.println("Задание 6");
        printSign(-8);
    }

    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void Task7() {
        System.out.println("Задание 7");
        boolean isNegativeNumber = isNegative(-10);
        System.out.println ("Число отрицательное:"  + isNegativeNumber);
    }
    public static boolean isNegative (int number) {
        return number < 0;
    }
}
