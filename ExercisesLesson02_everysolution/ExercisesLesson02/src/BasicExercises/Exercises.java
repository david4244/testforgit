package BasicExercises;

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
        System.out.println();

        exerciseFive();
        System.out.println();

        exerciseSix();
        System.out.println();

        exerciseSeven();
    }

    public static void exerciseOne() {
        System.out.print("Please enter your name: ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();

        System.out.printf("Hello %s, welcome to the Java course.\n", userName);
    }

    public static void exerciseTwo() {
        System.out.print("Please enter your firstname: ");
        Scanner userInput = new Scanner(System.in);
        String userFirstName = userInput.nextLine();

        System.out.print("Please enter your lastname: ");
        String userLastName = userInput.nextLine();

        System.out.print("Please enter your age: ");
        int userAge = userInput.nextInt();

        //System.out.println(userFirstName + " " + userLastName + " is " + userAge + " years old.");

        System.out.printf("%s %s is %d years old.\n", userFirstName, userLastName, userAge);
    }

    public static void exerciseThree() {
        System.out.print("Please give the amount of USD: ");
        Scanner userInput = new Scanner(System.in);
        double amountOfUsd = userInput.nextDouble();

        double exchangeNumber = 1.01;
        double amountInEuro = amountOfUsd * exchangeNumber;

        System.out.printf("%.2f€\n", amountInEuro);
    }

    public static void exerciseFour() {
        System.out.print("How many EUROs do You want to withdraw? ");
        Scanner userInput = new Scanner(System.in);
        int amountOfWithdraw = userInput.nextInt();

        if (amountOfWithdraw <= 1000) {
            System.out.printf("Withdraw was successful. You left %d EUROs.\n", (1000 - amountOfWithdraw));
        } else {
            System.out.printf("Withdraw was unsuccessful. You only have %d EUROs, it is %d EUROs less than You tried to withdraw.\n", 1000, (amountOfWithdraw - 1000));
        }
    }

    public static void exerciseFive() {
        System.out.print("Please add the size of 'a': ");
        Scanner userInput = new Scanner(System.in);
        double a = userInput.nextDouble();

        System.out.print("Please add the size of 'b': ");
        double b = userInput.nextDouble();

        double hypotenuse = Math.sqrt((a * a) + (b * b));

        System.out.printf("The triangle's hypotenuse is %.2f.\n", hypotenuse);
    }

    public static void exerciseSix() {
        System.out.print("Please add the first number: ");
        Scanner userInput = new Scanner(System.in);
        double firstNumber = userInput.nextDouble();

        System.out.print("Please add the second number: ");
        double secondNumber = userInput.nextDouble();

        if (secondNumber == 0) {
            System.out.println("Sorry, cannot divide by 0");
        } else {
            double result = firstNumber / secondNumber;

            System.out.printf("The result of the division is %.2f.\n", result);
        }
    }

    public static void exerciseSeven() {
        System.out.print("Please add the year: ");
        Scanner userInput = new Scanner(System.in);
        int year = userInput.nextInt();

        if(isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
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
}
