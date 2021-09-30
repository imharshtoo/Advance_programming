package practice_of_java;

public class practice_5 {
    //static void multiplication(int n){
    //problem 1:---------------------------------------------------------------------------------------------------------
        /*         for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    } */

    //problem 2:------------------------------------------------------------------------------------------------------------------
    //pattern
/*     static void multiplication(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println("\n");


        }

    } */
    //problem 3:factorial---------------------------------------------------------------------------------------------------
//    static int multiplication(int n){
//by using loops:
        /*         int sum=0;
        for (int i=1;i<n;i++){
            sum+=i;
        }
        return sum; */
//using recursion:
/*         if (n==1){
            return 1;
        }
        else{ */
            //sum of n nos is:1+2+3+.....n-1+n
            //sum(n-1)+n:
/*             return n+multiplication(n-1); */
  //      }
//    }
        //problem no 4:--------------------------------------------------------------------------------------------------------
        //pattern
/*         static void multiplication(int n){
            for(int i=n;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("*");

                }
                System.out.println("");

            }
        } */
    
    //problem 5:fibbonacci series:-------------------------------------------------------------------------------------------
/*     static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    } */
    //problem no:6------------------------------------------------------------------------------------------------------------
/*         static float average(int ...arr){
            float sum=0;
            for (float a:arr){
                sum+=a;
            }
            float n=arr.length;
            return sum/n; */

        //}
        //problem no:7
/*         static void pattern(int n){
        if(n>0){
            //pattern(n); for seddha pattern
            for (int i=n;i>0;i--){
                System.out.print("*");

            }
            System.out.println();
            pattern(n-1);//for ulta pattern
            }
        } */
        //problem no:8
        static void change(float celcius){
            float farheniet=(9/5*celcius)+32;
            System.out.println(farheniet);
            
        }


    public static void main(String[] args) {
        //problem 1,2,3:        
        //int n=6;
        //System.out.println("the sum of the n natural nos is:"+multiplication(n));
        //problem 4:
/*         int n=6;
        multiplication(n); */
        //problem 5:
/*         int n=5;
        System.out.printf("the fibonacci %dth term  of series is "+fibo(n),n); */
        //problem 6:
        //System.out.println("the average of the set of nos is "+average(2,3,4,56));
        //problem 7:
       // pattern(6);
       

    //problem no:8--------------
    change(37);
    }
    
}
