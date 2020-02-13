import java.sql.SQLOutput;

public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("Using recursion:");
        for(int i = 0; i < 10; i++){
            System.out.printf("The %d number in the fibonacci sequence is %d%n", i, fibonacciRecursion(i));
        }
        System.out.println();

        System.out.println("Using iteration:");
        for(int i = 0; i < 10; i++){
            System.out.printf("The %d number in the fibonacci sequence is %d%n", i, fibonacciIteration(i));;
        }

    }

    private static int fibonacciRecursion(int n){
        if(n==1||n==0){
            return n;
        }
        else{
            return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
        }
    }

    private static int fibonacciIteration(int n){
        if(n==1||n==0){
            return n;
        }
        if(n==2){
            return 1;
        }
        else{
            int first = 1;
            int second = 1;
            int total = 0;

            for(int i = 2; i < n; i++){
                total = first + second;
                first = second;
                second = total;
            }
            return total;
        }
    }
}
