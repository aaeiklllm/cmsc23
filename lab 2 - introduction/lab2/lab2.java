import java.util.Scanner;
public class lab2 {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

      if ((Character.isDigit(str.charAt(0)))){
          System.out.println("blue");
      }

      else if ((Character.isLetter(str.charAt(0)))){
          System.out.println(str.substring(1));
      }

      else{
          System.out.println("?");
      }
    }
}