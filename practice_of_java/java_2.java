/* package practice_of_java;
import java.util.Scanner;
import java.util.Arrays;
 


public class java_2 {
    public static void  ans( int arr[] ,int n, int k){
    int sum=0;
    Arrays.sort(arr);
    if(arr.length<=k){
        System.out.println("0");
    }
    else{
        for(int i=0;i<n-k;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        k=input.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++)
        arr[i]=input.nextInt();
        ans(arr,n,k);
        
    }
    
}
 */