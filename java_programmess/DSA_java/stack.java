package java_programmess.DSA_java;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack <Integer>stk=new Stack <>();
        boolean result=stk.empty();
        System.out.println("the stack is empty or not! "+result);
        stk.push(12);
        stk.push(43);
        stk.push(32);
        stk.push(17);
        stk.pop();
        int fruit=stk.peek();
        int location=stk.search(32);
        int x=stk.size();
        System.out.println("the size of satck is "+x);
        System.out.println("the location is"+location);
        System.out.println("the top element is "+fruit);
        System.out.println("the elements in stack! is "+stk);
        result=stk.empty();
        System.out.println("the stack is empty or not! "+result);
        
    }
    
}
