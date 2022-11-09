package ExtraExercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(exerciseOne("a") + "\n");

        System.out.println(exerciseTwo("Hello"));

        System.out.println(exerciseThree("banana") + "\n");

        exerciseFour();
        System.out.println();

        exerciseFive();
        System.out.println("\n");

        exerciseSix();
        System.out.println();

        exerciseSeven();
        System.out.println("\n");

        exerciseEight();
        System.out.println();

        exerciseNine();
        System.out.println();

        exerciseTen();
        System.out.println();

        System.out.println(exerciseEleven(1, 10) + "\n");

        exerciseTwelve();
    }

    public static boolean exerciseOne(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static String exerciseTwo(String stringToReverse) {
        String reversedString = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString += stringToReverse.charAt(i);
        }

        return "\"" + stringToReverse + "\" would become \"" + reversedString + "\"\n";
    }

    public static String exerciseThree(String input) {
        String modifiedInput = "";

        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                modifiedInput += input.charAt(i);
            } else {
                modifiedInput += "-" + input.charAt(i);
            }
        }

        return modifiedInput;
    }

    public static void exerciseFour() {
        System.out.print("Please add the size of the triangle: ");
        Scanner userInput = new Scanner(System.in);
        int s = userInput.nextInt();

        System.out.print("Please add how many triangle do You want: ");
        int howMany = userInput.nextInt();

        for (int k = 0; k < howMany; k++) {
            for (int i = 1; i <= s; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }

    public static void exerciseFive() {
        System.out.print("Please add the height of the tree: ");
        Scanner userInput = new Scanner(System.in);
        int height = userInput.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int j = 1; j <= height - 1; j++) {
            System.out.print(" ");
        }

        System.out.print("I");
    }

    public static void exerciseSix() {
        System.out.print("Please add a sentence: ");
        Scanner userInput = new Scanner(System.in);
        String sentence = userInput.nextLine();

        for (int i = 0; i < sentence.split(" ").length; i++) {
            System.out.println(sentence.split(" ")[i]);
        }
    }

    public static void exerciseSeven() {
        System.out.print("Please add a sentence: ");
        Scanner userInput = new Scanner(System.in);
        String sentence = userInput.nextLine();

        String[] arrayFromSentence = sentence.split(" ");

        int max = arrayFromSentence[0].length();

        for (int i = 1; i < arrayFromSentence.length; i++) {
            if (max < arrayFromSentence[i].length()) {
                max = arrayFromSentence[i].length();
            }
        }

        for (int i = 1; i <= max + 4; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < arrayFromSentence.length; i++) {
            arrayFromSentence[i] = "* " + arrayFromSentence[i];

            for (int j = arrayFromSentence[i].length() - 1; j <= max + 1; j++) {
                arrayFromSentence[i] += " ";
            }

            arrayFromSentence[i] += "*";

            System.out.println(arrayFromSentence[i]);
        }

        for (int i = 1; i <= max + 4; i++) {
            System.out.print("*");
        }
    }

    public static void exerciseEight() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }

    public static void exerciseNine() {
        System.out.print("Please add the text You want to translate: ");
        Scanner userInput = new Scanner(System.in);
        String textToTranslate = userInput.nextLine();

        String plainChars = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caeserCipherChars = " XYZABCDEFGHIJKLMNOPQRSTUVW";
        String translatedText = "";

        for (int i = 0; i < textToTranslate.length(); i++) {
            for (int j = 0; j < plainChars.length(); j++) {
                if (textToTranslate.charAt(i) == plainChars.charAt(j)) {
                    translatedText += caeserCipherChars.charAt(j);

                    break;
                }
            }
        }

        System.out.printf("Converted text: %s\n", translatedText);
    }

    public static void exerciseTen() {
        int[] primes = new int[5];
        int counter = 0;
        int numberToIncrease = 1;

        while (counter < primes.length) {
            //I used this formula: n is prime, and (2^n) − 1 is prime too, then I can use it
            if (isPrime(numberToIncrease) && isPrime((int)(Math.pow(2, numberToIncrease) - 1))) {
                primes[counter] = numberToIncrease;

                counter++;
            }

            numberToIncrease++;
        }

        for (int i = 0; i < primes.length; i++) {
            //I used this formula: 2^(n−1)((2^n) − 1), where n satisfies the formula above
            int perfectNumber = (int)(Math.pow(2, primes[i] - 1) * (Math.pow(2, primes[i]) - 1));

            System.out.println(perfectNumber);
        }
    }

    public static boolean isPrime(int numToCheck) {
        if (numToCheck == 2) {
            return true;
        }

        if (numToCheck % 2 == 0 || numToCheck <= 1) {
            return false;
        }

        int counter = 3;

        while (counter <= numToCheck / 2) {
            if (numToCheck % counter == 0) {
                return false;
            }

            counter += 2;
        }

        return true;
    }

    public static int exerciseEleven(int min, int max) {
        int range = max - min + 1;

        return (int)(Math.random()  *range) + 1;
    }

    public static void exerciseTwelve() {
        int randomNumber = exerciseEleven(1, 100);
        boolean doWin = false;

        do {
            System.out.print("Please write your guess: ");
            Scanner userInput = new Scanner(System.in);
            int guess = userInput.nextInt();

            if (guess > randomNumber) {
                System.out.println("Your guess higher.");
            } else if (guess < randomNumber) {
                System.out.println("Your guess was lower.");
            } else {
                System.out.println("Congratulation! You win!");
                doWin = true;
            }
        } while (!doWin);
    }
}
