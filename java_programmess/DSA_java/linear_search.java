package java_programmess.DSA_java;

public class linear_search {
        static int linear_search1(int [] arr,int size,int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    static int binary_search(int[] arr,int size,int element){
        //start searching
        int low,mid,high;
        low=0;
        high=arr.length;
        while(low<=high){
            mid=(low+high)/2;    
            if(arr[mid]==element){
                return mid;
            }
            if(arr[mid]<element){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //unsorted array for linear search
        //int [] arr={1,3,4,56,7,87,332,311,34};
        //int size=arr.length;
        //sorted array for binary search
        int [] arr={1,2,3,4,7,9,12,15,17,23,34,45,67,78,89,90};
        int size=arr.length;
        int element=90;
        int search=binary_search(arr, size, element);
        System.out.printf("the element %d is found at index %d",element,search);

        
    }
    
}
