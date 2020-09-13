public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));
    }
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            int result = n + fibonacci(n-1);
            n--;
            return result;
        }
    }
}
