package java_programmess.DSA_java;

public class insertion_10 {
    static void display(int[] marks,int n){
        for(int i=0;i<n;i++){
            System.out.printf("%d\n",marks[i]);
        }
    }
    static int indinsertion(int [] marks,int size,int element1,int capacity ,int index){
        if(size>=capacity){
            return -1;
        }
        for(int i=size-1;i>=index;i--){
            marks[i+1]=marks[i];
        }
        marks[index]=element1;
        return 1;
    }
    public static void main(String[] args) {
        int [] marks;
        marks=new int[100];
        marks[0]=7;
        marks[1]=8;
        marks[2]=12;
        marks[3]=27;
        marks[4]=88;
        //display(marks,5);
        int size=5,element1=45,index=3;
        indinsertion(marks,size,element1,100,index); 
        size+=1;
        display(marks, size);

        
    }
    
}
