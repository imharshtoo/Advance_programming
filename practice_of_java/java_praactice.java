/* package practice_of_java;

import java.io.*;
 
class Main {
    public static int get(int arr[], int departure[],
                                   int size_of_arr)
    {
        int p= 1, ans = 1;
        
        for (int i = 0; i < size_of_arr; i++) {
            p = 1;
 
            for (int j = i + 1; j < size_of_arr; j++) {
                if ((arr[i] >= arr[j] && arr[i] <= departure[j])
                    || (arr[j] >= arr[i]
                        && arr[j] <= departure[i]))
                    p++;
            }
            if(ans<p)
            ans=p;
        }
 
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {900,1100,1030,930 };
        int departure[] = {1000,1130,1100,1030  };
        int size_of_arr =4 ;
        System.out.println(get(arr, departure, size_of_arr));
    }
} */