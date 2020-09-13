import java.util.Scanner;

public class Prettify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word here:");
        String myWord = scanner.nextLine();

        System.out.println("Enter your separating character here:");
        char character = scanner.next().charAt(0);

        //calling the method because it's not static (for practice)
        prettifyTwo(myWord, character);
    }
//    public void prettify(String myString, char separatingChar){
//        String newString = "";
//
//        for(int i = 0; i < myString.length(); i++){
//            char eachChar = myString.charAt(i);
//            newString = newString + eachChar + separatingChar;
//        }
//        System.out.println(newString);
//    }
    public static void prettifyTwo (String myString, char separatingChar){
        String newString = "";
        for (char eachChar: myString.toCharArray()){
            newString = newString + eachChar + separatingChar;
        }
        System.out.println("Your prettified word: " + newString);
    }
}
