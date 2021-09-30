package practice_of_java;

public class java_33_varargs {
/*     static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b, int c){
        return a+b+c;


    } */
    static int sum(int a,int ...arr){
        int result=a;
        for (int b:arr){
            result+=b;

        }
        return result;
    }

        
    public static void main(String[] args) {
        //System.out.println("the sum of nothing is "+sum()); it will show me error because one argument is fixed now as a:
        System.out.println("the sum of 3 and 4 is "+sum(3,4));
        System.out.println("the sum of 5 , 6 and 7 is "+sum(5,6,7));
        
    }
    
}
