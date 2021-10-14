public class Recursion {
    /**
     * Anything you do with recursion you can do with a for loop
     * **/
    public static void main(String[] args) throws Exception {
        System.out.println("print increasing 1-5");
        recursivePrintInc(5);

        System.out.println("print decreasing 5-1");
        recursivePrintDec(5); 
        
        System.out.println("print Factorial of 5");
        System.out.print(factorial(5));
        
    }

    // print decreasing
    public static void recursivePrintDec(int i){
         // Base Case
         if( i <= 0) return;

        // Some process
        System.out.println(i);

         // Recursive Case
         i = i - 1; // to meet base case
         recursivePrintDec(i);
    }

    //print increasing
    public static void recursivePrintInc(int i){
        // Base Case
        if( i <= 0) return;

         // Recursive Case
         i = i - 1; // to meet base case
         recursivePrintInc(i);

        // Some process
        System.out.println(i + 1);
    }

    public static int factorial(int f){
        // Base Case
        if ( f <= 1) return 1;

        // Recursive Case and some process
        int f_1 = f - 1;
        return f * factorial(f_1);
    }
}
