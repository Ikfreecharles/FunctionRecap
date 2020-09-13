public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
    public static int fibonacci(int nthTerm){
        if (nthTerm == 0){
            return 0;
        }else if (nthTerm <= 2){
            return 1;
        }else{
            return fibonacci(nthTerm-1) + fibonacci(nthTerm-2);
        }
    }
}
