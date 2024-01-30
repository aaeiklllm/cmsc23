import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings?");
        int items = sc.nextInt();

        String [] strs;
        strs = new String[items+1];

        if (items == 1){
            System.out.println("Enter " + items + " string: ");
        }

        else{
            System.out.println("Enter " + items + " strings: ");
        }


        for (int i = 0; i < strs.length; ++i){
            strs[i] = sc.nextLine();
        }

        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();
        StringBuilder chosenString = new StringBuilder(strs[num]);
        System.out.println("Your string is " + chosenString);

        String numAsString = Integer.toString(num);
        chosenString.replace(0, 1, numAsString);
        chosenString.append('!');

        String printString = chosenString.toString();
        System.out.println("Your modified string is " + printString);

        String lastString = strs[strs.length-1];
        lastString = lastString.replaceAll(".(?=.)", "$0 ");
        System.out.println("Let's separate the characters of your last string by spaces! *" + lastString + "*");
    }
}