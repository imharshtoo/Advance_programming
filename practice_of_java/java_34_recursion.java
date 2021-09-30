package practice_of_java;

public class java_34_recursion {
/*     static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
        //    return n*factorial(n-1);
        int product=1;
        for (int i=1;i<=n;i++){
            product*=i;

        }
        return product;
        } */
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return (fibonacci(n-1)+fibonacci(n-2));
        }

        }
    public static void main(String[] args) {
        int n=2;
/*         System.out.println("the factorial of a no "+n+" is");
        System.out.println(factorial(n)); */
        System.out.println("the fibonnaci of "+n+" is");
        System.out.println(fibonacci(n));
        
    }
    
}
