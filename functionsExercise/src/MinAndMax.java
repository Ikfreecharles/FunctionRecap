import java.util.ArrayList;

public class MinAndMax {
    public static void main(String[] args) {
        printLn(SumAndAverage.input());
    }
    public static int min (ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for (int eachNumber: numbers){
            if (eachNumber < min){
                min = eachNumber;
            }
        }
        return min;
    }
    public static int max (ArrayList<Integer> numbers){
        int max = 0;
        for (int eachNumber : numbers) {
            if (max < eachNumber) {
                max = eachNumber;
            }
        }
        return max;
    }
    public static void printLn(ArrayList<Integer> numbers){
        System.out.println("The minimum number here is " + min(numbers));
        System.out.println("The maximum number here is " + max(numbers));
    }
}
