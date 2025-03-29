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
        Task8();
        Task9();
        Task10();
        Task11();
        Task12();
        Task13();
        Task14();
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
        System.out.println("Число отрицательное:" + isNegativeNumber);
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void Task8() {
        System.out.println("Задание 8");
        String string = "Котенок";
        int count = 3;
        System.out.println("String:" + string.repeat(count));
    }

    public static void Task9() {
        System.out.println("Задание 9");
        boolean isLeap = isLeapYear(2025);
        System.out.println("Високосный год " + isLeap);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void Task10() {
        System.out.println("Задание 10");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void Task11() {
        System.out.println("Задание 11");
        int[] arr = emptyArr(100);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static int[] emptyArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void Task12() {
        System.out.println("Задание 12");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void Task13() {
        System.out.println("Задание 13");
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println( " ");
        }
    }

    public static void Task14() {
        System.out.println("Задание 14");
        int len = 7;
        int initialValue = 5;
        int[] resultArr = createArr(len, initialValue);
        for (int num : resultArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}





