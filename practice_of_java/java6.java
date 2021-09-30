package practice_of_java;

public class java6 {
    public static void main(String[] args) {
        int a=6*5-34/2;
        /*highest precedence goes to * and /.and they are evaluated on  the basis of 
        left to right associativity
        =30-17
        =13*/
        int b= 60/5-34*2;
        /* =12-68
           = -56*/
        System.out.println(a);
        System.out.println(b);
    }
    
}
