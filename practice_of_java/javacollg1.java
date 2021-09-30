package practice_of_java;

//import java.util.Scanner;
class Solution {
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for(int i=2;i<n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String[] args)
    {
        //Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        //System.out.printf("Total ways to reach the %d'th stair are %d",
                            //n, climbStairs(n));
    }
}
