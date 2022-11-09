package ArrayExercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        exerciseOne();
        System.out.println();

        exerciseTwo();
        System.out.println();

        exerciseThree();
        System.out.println();

        exerciseFour();

        System.out.println(exerciseFive());
        System.out.println();

        exerciseSix();
        System.out.println();

        exerciseSeven();
    }

    public static void exerciseOne() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator(1, 100);
        }

        int result = numbers[0] + numbers[numbers.length - 1];

        System.out.println(result);
    }

    public static void exerciseTwo() {
        System.out.print("How many elements do you want in the array? ");
        Scanner userInput = new Scanner(System.in);
        int elements = userInput.nextInt();
        int[] numbers = new int[elements];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator(1, 100);
        }

        if (numbers.length % 2 != 0) {
            int result = numbers[numbers.length / 2];
            System.out.print(result);
        } else {
            int result = numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2];
            System.out.print(result);
        }

    }

    public static void  exerciseThree() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator(1, 100);
        }

        int[] reverseNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length - i - 1];
        }
    }

    public static void exerciseFour(){
        int[] fibonacciNums = new int[20];

        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber = 1;

        for (int i = 0; i < fibonacciNums.length; i++) {
            if (i == 0) {
                fibonacciNums[i] = currentNumber;
            } else {
                currentNumber = firstNumber + secondNumber;

                fibonacciNums[i] = currentNumber;

                firstNumber = secondNumber;
                secondNumber = currentNumber;
            }
        }
    }

    public static boolean exerciseFive(){
        System.out.print("How many elements do you want in the array? ");
        Scanner userInput = new Scanner(System.in);
        int elements = userInput.nextInt();
        int[] numbers = new int[elements];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator(1, 100);
        }

        System.out.print("Which number do You want to check? ");
        int answer = userInput.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == answer) {
                return true;
            }
        }

        return false;
    }

    public static int randomGenerator(int min, int max) {
        int range = max - min + 1;

        return (int)(Math.random() * range) + 1;
    }

    public static void exerciseSix(){
        String[] names = {"Josie", "Cathrin", "Bob", "Max", "Hannah", "Alex"};

        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }
    }

    //I do not know I understand the task well.
    public static void exerciseSeven(){
        String[] names = {"Josie", "Cathrin", "Bob", "Max", "Hannah", "Alex"};

        int maxPos = 0;
        int max = names[maxPos].length();

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > max) {
                max = names[i].length();
                maxPos = i;
            }
        }

        System.out.println(names[maxPos]);
    }
}
