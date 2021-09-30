package practice_of_java;

public class java17method_overloading {
    static void foo(){
        System.out.println("good morning !bro");
    }
    static void foo(int a){
        System.out.println("good morning " + a +" !bro");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+ a+" brother");
        System.out.println("good morning "+b+" brother");
    }
    static void telljoke(){
        System.out.println("I invited some guests");

    }
    static void change(int a){
         a=47;

    }
    static void change2(int [] arr){
        arr[0]=34;

    }
    public static void main(String[] args) {
        //no change in the value:
        telljoke();
        int x=45;
        change(x);
        System.out.println("the changed value is"+x);
        // in array the value is changed.
        int [] marks={12,43,5,546,677};
        change2(marks);
        System.out.println("the changed value of arr is:"+marks[0]);
    
    foo();
    foo(334);
    foo(32,45);

        
    }
    
}
