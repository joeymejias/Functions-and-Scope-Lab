import java.util.Scanner;

/**
 * Created by joey on 6/21/16.
 */
public class Main {

    public static void main(String[] args) {
        parameterCount("bacon", "egg", "cheese");
        stringLength("bacon");
        longestString("bacon", "egg");
        userInput();
        typeQuit();

        boolean returnedValue = isEven(2);
        System.out.println(returnedValue);


    }

    public static void parameterCount(String... string1){
        System.out.println(string1.length);
    }

    public static void stringLength(String string1){
        int length = string1.length();
        System.out.println (length);
    }

    public static void longestString(String string1, String string2){
        if (string1.length() > string2.length()){
            System.out.println(string1.length());
        } else {
            System.out.println(string2.length());
        }
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }

    public static void typeQuit(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("quit")){
            System.out.println("Exiting loop.");
        } else {
            System.out.println(input);
            typeQuit();
        }
    }

    public static boolean isEven(int int1){
        return int1 % 2 == 0;
    }


    public static int fibonacci(int int1){
        return 0;
    }

}
