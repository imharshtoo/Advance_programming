package practice_of_java;

public class practice_4 {
    public static void main(String[] args) {
        //practice problem 1
/*         float [] marks={88.1f,88.7f,99.3f,98.5f,96.7f};
        
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the sum of five no is "+sum); */
        
        //problem 2:
/*         float [] marks={88.1f,88.7f,99.3f,98.5f,96.7f};
        boolean isinarray=false;
        
        float sum=88.1f;
        for(float element:marks){
            if (sum==element){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
            System.out.println("the element is present");
        }
        else{
            System.out.println("element is not present");
        }
        
 */
//problem 3:
/*         float [] marks={88.1f,88.7f,99.3f,98.5f,96.7f};
        
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the average of five no is "+sum/5.0f); */
    //problem 4: addition of matrices
/*     int [] [] mat1={{3,4,5},
                    {8,9,7}};
    int [] [] mat2={{1,2,3},
                    {4,5,6}};
    int [] [] mat3={{0,0,0},
                    {0,0,0}};
    for(int i=0;i<mat1.length;i++){
        for (int j=0;j<mat1[i].length;j++){
            System.out.printf("printing the sum as i=%d and  j=%d\n",i,j);
            mat3[i][j]=mat1[i][j]+mat2[i][j];
        }
}
for(int i=0;i<mat1.length;i++){
    for (int j=0;j<mat1[i].length;j++){
        System.out.print(mat3[i][j]+" ");
        mat3[i][j]=mat1[i][j]+mat2[i][j];
    }
    System.out.println("");
} */
    //problem no:5
/*     int [] arr={05,13,20,4,3,12};
    int l=arr.length;
    int n=Math.floorDiv(l, 2);
    int temp;

    for (int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-1-i];
        arr[l-i-1]=temp;
}
    for (int element:arr){
        System.out.print(element+" ");
    } */
    //problem no 6:
/*     int [] arr={05,13,20,4,3,12};
    int max=Integer.MIN_VALUE;
    for(int e:arr){
        if (e>max){
            max=e;
        }
    }
    System.out.println("the value of the maximum element is "+max);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE); */ 
//problem no 7:min integer in array
    /*     int [] arr={05,13,20,4,3,12};
    int min=Integer.MAX_VALUE;
    for(int e:arr){
        if (e<min){
            min=e;
        }
    }
    System.out.println("the minimum no in array is"+min); */
//problem no:8 of if a array is sorted or not.
    int [] arr={1,33,43413,5,35,5,35};
    boolean isarray=true;
    for(int i=0;i<arr.length;i++){
        if (arr[i]>arr[i+1]){
            isarray=false;
            break;
        }
    }
    if(isarray){
        System.out.println("the array is sorted");
    }
    else{
        System.out.println("the array is not sorted");
    }
}

    
}
