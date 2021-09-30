package java_programmess.DSA_java;

public class bubble_sort {
    static void bub_sort(int k,int [] arr){
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<(arr.length)-i;j++){
                if(arr[j]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;

                }
            }
        }        
    }

    public static void main(String[] args) {
        int k=0;
        int [] arr={1,3,2,9,8,6};
        bub_sort(k, arr);
        System.out.println("arrays after sorting");
        for (int i : arr) {
            System.out.print(i+" ");

            
        }


        
    }
    
}
