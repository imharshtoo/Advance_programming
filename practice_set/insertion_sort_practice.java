package practice_set;

public class insertion_sort_practice {
    public static void insertioN(int [] arr){
      int item,j;
      for(int i=0;i<arr.length;i++){
        item=arr[i];
        j=i-1;
        while(j>-1 && item<arr[j]){
          arr[j+1]=arr[j];
          j=j-1;
          arr[j+1]=item;
      }
    }
}
  public static void main(String[] args) {
      int [] arr={11,8,6,1,9,2};
      insertioN(arr);
      System.out.println("sorted array is");
      for(int i:arr){
        System.out.print(i+" ");
      }

  }
}
