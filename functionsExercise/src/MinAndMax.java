import java.util.ArrayList;

public class MinAndMax {
    public static void main(String[] args) {
        //the method .input() is called as a reference from the class SumAndAverage.java
        printLn(SumAndAverage.input());
    }
    public static double min (ArrayList<Double> numbers){
        double min = numbers.get(0);
        for (double eachNumber: numbers){
            if (eachNumber < min){
                min = eachNumber;
            }
        }
        return min;
    }
    public static double max (ArrayList<Double> numbers){
        double max = 0;
        for (double eachNumber : numbers) {
            if (max < eachNumber) {
                max = eachNumber;
            }
        }
        return max;
    }
    public static void printLn(ArrayList<Double> numbers){
        System.out.println("The minimum number here is " + min(numbers));
        System.out.println("The maximum number here is " + max(numbers));
    }
}