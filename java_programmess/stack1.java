package java_programmess;

import java.util.Scanner;
public class stack1 {
    int [] arr=null;
    int capacity=5;
    int top=-1;
    public stack1(){
        this.arr=new int[capacity];
    }
    public stack1(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
    }
    public void push(int data){
        if(top+1==capacity){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
        System.out.println(data+" inserted into stack");
    }
    public void pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        int data=arr[top--];
        System.out.println(data+"remove element form stack");
    }
    public static void main(String[] args) {
        stack1 op=new stack1();
        Scanner input =new Scanner(System.in);
        int item= input.nextInt();
        op.push(item);
        
        
    }

    
}
