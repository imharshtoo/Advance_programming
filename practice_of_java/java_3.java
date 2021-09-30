/* package practice_of_java;
import java.util.Scanner;

public class java_3 {
    static int getLargestRect(int arr[])
{
    int maxArea = 0;
    int minHeight = 0;
    for(int i = 0; i<arr.length; i+=1)
    { 
       maxArea = Math.max(arr[i], maxArea);
       minHeight = arr[i];
       for(int j = i-1; j>=0 ; j-=1)
       {
          minHeight = Math.min(arr[j], minHeight);
          int width = (j-i+1);
          maxArea = Math.max(maxArea, (minHeight*width));
       }
    }
       return maxArea;
}


    public static void main(String[] args) {
        int n ;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++)
        arr[i]=input.nextInt();
        System.out.println(getLargestRect(arr));


        

        
    }

    
} */