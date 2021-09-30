package java_programmess.DSA_java;
class quick_sort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    static int partition(int [] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;// index of smaller element
        for(int j=low;j<high;j++){
            // If current element is smaller than or
            // equal to pivot
            if(arr[j]<=pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quick(int [] arr,int low,int high){
        if(low<high){
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int  p1=partition(arr,low,high);
            // Recursively sort elements before
            // partition and after partition
            quick(arr, low, p1-1);
            quick(arr, p1+1, high);
        }
    }
/* A utility function to print array of size n */
    static void print(int []arr){
        for (int i=0;i<arr.length;++i) {
            System.out.print(arr[i]+" ");
            
        }
    }
    // Driver program
    public static void main(String[] args) {
        int [] arr={10,7,6,1,9,3,5,8};
        int low=0;
        int high=arr.length-1;
        quick(arr, low, high);
        System.out.println("the sorted array is");
        print(arr);
        
        
    }
    
}
