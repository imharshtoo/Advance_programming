package java_programmess.DSA_java;
public class deletion_11 {
    static void display(int[] marks,int n){
        for(int i=0;i<n;i++){
            System.out.printf("%d ",marks[i]);
        }
        System.out.println("\n");
    }
    static void inddeletion(int [] marks,int size,int index){
        for(int i=index;i<size-1;i++){
            marks[i]=marks[i+1];
        }
    }
    public static void main(String[] args) {
        int [] marks;
        marks=new int[100];
        marks[0]=7;
        marks[1]=8;
        marks[2]=12;
        marks[3]=27;
        marks[4]=88;
        display(marks,5);
        int size=5,index=3;
        inddeletion(marks,size,index); 
        size-=1;
        display(marks, size);

        
    }
    
}

