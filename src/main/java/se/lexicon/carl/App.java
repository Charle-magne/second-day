package se.lexicon.carl;
import java.util.Scanner;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

/*
        Scanner input = new Scanner(System.in);
        System.out.print("What year is it? ");
        int number = input.nextInt();
        int modulus = (number%4);
        if (modulus == 0) {
            System.out.print("This is a leap year.");
        }
        else {
            System.out.print("This isn't a leap year. Like at all.");
        }

//-------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int num1 = input.nextInt();

        System.out.print("Enter number two: ");
        int num2 = input.nextInt();

        System.out.print("Enter number three: ");
        int num3 = input.nextInt();

        double avg = ((num1+num2+num3)/3);
        System.out.println(avg);

//---------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name1 = input.next();

        System.out.println("Hello " + name1);

//--------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.print("Gimmie number one: ");
        double numb1 = input.nextInt();

        System.out.print("Gimmie the other number: ");
        double numb2 = input.nextInt();

        double sum = (numb1+numb2);
        double div = (numb1/numb2);
        double sub = (numb1-numb2);
        double mul = (numb1*numb2);

        System.out.print("The sum is " + sum + "." + " The sub is " + sub + ". " + "The multiplication is " + mul + "." + " The division is " + div + ".");

        //--------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int inputSec = input.nextInt();

        int hourMod = (inputSec%3600);
        int hours = ((inputSec-hourMod)/3600);

        int minuteMod = (hourMod%60);
        int minutes = ((hourMod-minuteMod)/60);

        int secondMod = (minuteMod%60);

        System.out.println(hours + " hours, " + minutes + " minutes, " + secondMod + " seconds.");

        //---------------------------------------------------------------

        //---------------------GUESS THE NUMBER------------------------

        Scanner input = new Scanner(System.in);
        boolean keepTrying = true;

            Random rnd = new Random();
            int n = rnd.nextInt(499);
            n += 1;

            System.out.print("Guess the number between 1 and 500: ");

            do {

                int guess = input.nextInt();

                if (guess < n) {
                    System.out.print("Too low. Try again: ");
                }

                else if (guess > n) {
                    System.out.print("Too high. Try again: ");
                }

                else {
                    System.out.print("Correct!");
                    keepTrying = false; }

        } while(keepTrying);

        //--------------------------------------------------------*/

        //--------------------CALCULATOR--------------------------



        Scanner input = new Scanner(System.in);
        boolean keepTrying = true;
        System.out.println("Welcome to the calculator.");

        do {

            System.out.println("Start (1) or Exit (9)?");
            int choice = input.nextInt();

            if (choice == 1) {

                double num1;
                double num2;
                String opera;

                System.out.println("Enter the first number: ");
                num1 = input.nextInt();
                System.out.println("Enter the second number: ");
                num2 = input.nextInt();

                Scanner op = new Scanner(System.in);
                System.out.println("And just how do you want to calculate this mess?");

                opera = op.next();

                if (opera.equals("+")) {
                    System.out.println("The sum is " + (num1 + num2) + ".");
                } else if (opera.equals("-")) {
                    System.out.println("The result is " + (num1 - num2) + ".");
                } else if (opera.equals("*")) {
                    System.out.println("The result is " + (num1 * num2) + ".");
                } else if (opera.equals("/")) {
                    System.out.println("The result is " + (num1 / num2) + ".");
                } else {
                    System.out.println("Wrong type of operator you got there.");
                }
            } else if (choice == 9) {
                System.out.println("Bye.");
                keepTrying = false;
            } else {
                System.out.println("That's not an option... and you know it. Do try again.");
            }
        } while (keepTrying);
    }

    static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static double getNumber() {
        boolean valid = false;
        double number = 0;
        while(!valid) {
            try {
                number = Double.parseDouble(getStringFromUser().trim().replace(',','.'));
                valid = true;
            }catch(NumberFormatException e) {
                System.out.println("Input was not a number");
            }
        }
        return number;
    }



}