import java.util.*;

public class Main {
    /**<h1> Possible Substrings </h1>
     * This program gets all the possible substrings in a string.
     *
     * @author Mikaella Louise D. Layug
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++){
            getPossibleSubstrings(input, "", i);
        }
    }

    public static void getPossibleSubstrings(String input, String left, int i) {
        if (i >= input.length()) {
            return;
        }

        else{
            String newStr = left + input.charAt(i);
            System.out.print("{" + (newStr) + "}");
            getPossibleSubstrings(input, newStr, i + 1);
        }
    }
}