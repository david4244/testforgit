package LoopExercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
        System.out.println();

        exerciseTwo();
        System.out.println("\n");

        exerciseThree();
        System.out.println("\n");

        exerciseFour();
        System.out.println("\n");

        exerciseFive();
        System.out.println("\n");

        exerciseSix();
        System.out.println("\n");

        exerciseSeven();
        System.out.println("\n");

        exerciseEight();
        System.out.println("\n");

        exerciseNine();
        System.out.println("\n");

        exerciseTen();
        System.out.println();

        exerciseEleven();
    }

    public static void exerciseOne() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void exerciseTwo() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.printf(", %d", i);
            }
        }
    }

    public static void exerciseThree() {
        for (int i = 3; i <= 30; i++) {
            if (i == 3) {
                System.out.print(i);
            } else if (i % 3 == 0) {
                System.out.printf(", %d", i);
            }
        }
    }

    public static void exerciseFour() {
        for (int i = 10; i >= 1; i--) {
            if (i == 10) {
                System.out.print(i);
            } else {
                System.out.printf(", %d", i);
            }
        }
    }

    public static void exerciseFive() {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d ", i);

            if (i % 3 == 0) {
                System.out.print("TAP! ");
            }
        }
    }

    public static void exerciseSix() {
        System.out.print("Please add a number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.printf("%d ", i);
            } else {
                System.out.printf("+ %d ", i);
            }

            result += i;
        }

        System.out.printf("= %d", result);
    }

    public static void exerciseSeven() {
        System.out.print("Please add a number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int result = 0;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (result == 0) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("+ %d ", i);
                }

                result += i;
            }
        }

        System.out.printf("= %d", result);
    }

    public static void exerciseEight() {
        System.out.print("Please add a number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        System.out.print("Do You want the sum (0) or the product (1) of number? ");
        int answer = userInput.nextInt();

        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (answer == 0) {
                if (i == 1) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("+ %d ", i);
                }

                result += i;
            } else {
                if (i == 1) {
                    result = 1;

                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("* %d ", i);
                }

                result *= i;
            }
        }

        System.out.printf("= %d", result);
    }

    public static void exerciseNine() {
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf(", %s", "FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.printf(", %s", "Fizz");
                } else if (i % 5 == 0) {
                    System.out.printf(", %s", "Buzz");
                } else {
                    System.out.printf(", %d", i);
                }
            }
        }
    }

    public static void exerciseTen() {
        for (int i = 1900; i <= 2100; i++) {
            if (isLeapYear(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;

            if (year % 100 == 0 && year % 400 != 0) {
                isLeapYear = false;
            }
        }

        return isLeapYear;
    }

    public static void exerciseEleven() {
        int firstNumber = 0;
        int secondNumber = 1;

        int currentNumber = 1;
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                System.out.print(currentNumber + " ");
            } else {
                currentNumber = firstNumber + secondNumber;

                System.out.print(currentNumber + " ");

                firstNumber = secondNumber;
                secondNumber = currentNumber;
            }
        }
    }
}
