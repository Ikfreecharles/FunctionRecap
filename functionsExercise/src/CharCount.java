import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word here:");
        String myWord = scanner.nextLine();

        System.out.println("Enter the character to count here:");
        char charToFind = scanner.next().charAt(0);
        println(myWord, charToFind);
    }
    public static int charCount (String myString, char charToFind){
        int counter = 0;
        String myStringLowerCase = myString.toLowerCase();
        for (int i = 0; i < myStringLowerCase.length(); i++){
            char myChar = myStringLowerCase.charAt(i);
            if (myChar == charToFind){
                counter++;
            }
        }
        return counter;
    }
    public static void println(String myString, char charToFind){
        int counter = charCount(myString, charToFind);
        System.out.println("There are " + counter + " " + charToFind + " in the word " + myString);
    }
}
