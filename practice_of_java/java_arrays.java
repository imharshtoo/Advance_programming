package practice_of_java;

public class java_arrays {
    public static void main(String[] args) {
        //arrays:
    //there are three main ways to create an array in java:
    //1.declaration and memory allocation:
    //int[] marks=new int[5];
    //2.declaration and then memory allocation:
/*     int[] marks;
    marks=new int[5];
    //intialization
    marks[0]=87;
    marks[1]=88;
    marks[2]=87;
    marks[3]=83;
    marks[4]=72; */
    //marks[5] throws an error:
    
    //3.declaratioon and memory allocation and intialization:
    int [] marks={40,88,78,91,33};
    //System.out.println(marks[4]);
    /* float [] marks={70.1f,60,50,73.33f};
    System.out.println(marks.length);
    System.out.println(marks[0]); */
    
    //displaying array in (naive way):
/*     System.out.println("printing array in reverse order");
    for (int i=(marks.length-1);i>=0;i--){
        System.out.println(marks[i]); */
    
    for(int element: marks){
        System.out.println(element);
    }
    




    }
    
}
