package java_programmess.DSA_java;
public class insertion_sort {
    public static void insertion_Sort(int [] arr){
        int j,k;
        for(int i=1;i<arr.length;i++){
            k=arr[i];
            j=i-1;
            while(j>-1 && arr[j]>k){
                arr[j+1]=arr[j];
                j=j-1;
            arr[j+1]=k;
            }
        }

    }
    public static void main(String[] args) {
        int [] arr={11,8,6,1,9,2};
        System.out.println("before insertion sort!");
        for (int i : arr) {
            System.out.print(i+" ");            
        }
        System.out.println("");
        insertion_Sort(arr);
        System.out.println("after sorting!");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    
}