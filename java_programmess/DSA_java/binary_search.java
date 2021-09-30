package java_programmess.DSA_java;
class binary_search {
    int bin_search(int [] arr,int k,int low,int high){
        if(high>=low){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                return bin_search(arr, k, low, mid-1);
            }
            else{
                return bin_search(arr, k, mid+1, high);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        binary_search op=new binary_search();
        int [] arr={1,2,6,7,9,12,15,19,23,28};
        int low=0;
        int high=arr.length;
        int k=23;
        int result=op.bin_search(arr,k,low,high);
        System.out.println(result);
    }
    
}
