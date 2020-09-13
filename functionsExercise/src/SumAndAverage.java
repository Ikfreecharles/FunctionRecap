import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        //We can call our methods here
        printLnSum(input());
        printLnAverage(input());
    }
    //Method for sum
    public static double sumOfArray (ArrayList<Double> numbers){
        double result = 0;
        for (double eachNumber : numbers) {
            result += eachNumber;
        }
        return result;
    }
    //Method for average
    public static double average (ArrayList<Double> numbers){
        double result = 0;
        if (numbers.size() < 1){
            System.out.println("Invalid operation");
        } else{
            double average = sumOfArray(numbers)/numbers.size();
            result += average;
        }
        return result;
    }
    //Println for Sum
    public static void printLnSum(ArrayList<Double> numbers){
        System.out.println("The sum of the numbers is " + sumOfArray(numbers));
    }
    //Println for Average
    public static void printLnAverage(ArrayList<Double> numbers){
        System.out.println("The average of the numbers is " + average(numbers));
    }
    //Method to input numbers
    public static ArrayList<Double> input (){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();

        System.out.println("Enter the amount of numbers in the list:");
        int amountofNumbers = input.nextInt();

        System.out.println("Enter your numbers:");
        for (int i = 1; i <= amountofNumbers; i++){
            double numbers = input.nextDouble();
            numberList.add(numbers);
        }

        return numberList;
    }
}
