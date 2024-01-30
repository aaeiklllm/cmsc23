import java.util.*;
import java.lang.Math;

public class Menu {
    public static void main(String[] args) {

        System.out.println("------Menu------");
        System.out.println("1. Number Tool");
        System.out.println("2. String Tool");
        System.out.println("3. Mystery Tool");
        System.out.println("4. Alphabet Tool");
        System.out.print("Input the number of your preferred tool: ");

        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();

        switch (item) {
            case 1 -> {
                System.out.println("This tool gets the absolute value of a number.");
                System.out.println();
                makeAbsolute();
            }
            case 2 -> {
                System.out.println("This tool compares the first letter of a string to the last letter of another string.");
                System.out.println();
                compareString();
            }
            case 3 -> {
                System.out.println("This tool runs the string tool then the number tool.");
                System.out.println();
                runBothMethods();
            }
            case 4 -> {
                System.out.println("This tool arranges two strings alphabetically.");
                System.out.println();
                Scanner str1 = new Scanner(System.in);
                System.out.print("Input first string: ");
                String firstStr = str1.nextLine();
                Scanner str2 = new Scanner(System.in);
                System.out.print("Input second string: ");
                String secondStr = str2.nextLine();
                checkAlphabeticalOrder(firstStr, secondStr);
            }
            default -> System.out.println("Please choose a number from 1-4!");
        }
    }
    static void makeAbsolute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int absoluteNum = Math.abs(num);
        System.out.print("Absolute value: ");
        System.out.println(absoluteNum);
    }

    static void compareString(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first string: ");
        String firstString = sc.nextLine();

        System.out.print("Enter your second string: ");
        String secondString = sc.nextLine();

        int length = secondString.length();

        if (firstString.charAt(0) == secondString.charAt(length-1)){
            System.out.println("Letters are equal.");
            System.out.println("passed!");
        }

        else{
            int min = 1;
            int max = 50;
            int rand = (int)(Math.floor(Math.random()*(max-min+1)+min));

            System.out.println("Letters are not equal.");
            System.out.println("Printing a random number from 1-50...");
            System.out.println(rand);
        }
    }

    static void runBothMethods(){
        System.out.println("Calling the string tool method...");
        compareString();

        System.out.println();

        System.out.println("Calling the number tool method...");
        makeAbsolute();

        System.out.println("all done");
    }

    static void checkAlphabeticalOrder(String firstString, String secondString){
        int comparedResult = firstString.compareToIgnoreCase(secondString);
        System.out.println();
        System.out.println("Strings in alphabetical order:");

        if (comparedResult <= 0){
            System.out.println(firstString);
            System.out.println(secondString);
        }

        else{
            System.out.println(secondString);
            System.out.println(firstString);
        }

    }







}