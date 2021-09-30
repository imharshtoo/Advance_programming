import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main { 
public static void main (String[] args) {
    Map<Integer, Integer> hp =new HashMap<Integer, Integer>();

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n; i++)  
    {  
    array[i]=sc.nextInt();  
    }  


   for( int i =0 ;i<array.length;i++)
        {if(hp.containsKey(array[i])){
            int freq = hp.get(array[i]);
            freq++;
            hp.put(array[i], freq);
        }
        else
        {
            hp.put(array[i], 1);
        }



        int max_count = 0, res = -1;
        int ans=0;
        for(Entry<Integer, Integer> val : hp.entrySet())
        {
        if (max_count < val.getValue())
        {
            res = val.getKey();
            max_count = val.getValue();
        }
        else
        if(max_count==val.getValue())
        {
        res=Math.max(res ,val.getKey());
        }
        }
        System.out.print(res +" ");
       System.out.println((hp.get(array[i])));
    
   }
}
}