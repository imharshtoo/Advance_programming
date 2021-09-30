/* package practice_of_java;

class base1{
    base1(){
        System.out.println("i am a constructor of base");//deafult constructor will be called;
    }
    base1(int x){
        System.out.println("i am a constructor with an integer of value " + x);//2nd constructor
    }

}
class derived1 extends base1{
    derived1(){
        //super(0);//this is a keyword for calling 2 constructor
        System.out.println("i am a constructor of derived");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("i am an overload constructor with derived value of y as "+y);
    }
    
}
class child extends derived1{
    child(){
        System.out.println("i am a child of derived constructor:");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overload constructor of child with value of z as "+z);
    }

}

public class constructors_in_inheritance {
    public static void main(String[] args) {
         //base1 b=new base1();
         //derived1 d=new derived1(13,14);
         //child ch=new child();
         child ch=new child(12,13,15);
        
        
    }
    
}

 */