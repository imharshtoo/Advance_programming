package practice_of_java;

class circle{
    circle(){
        System.out.println("i am non parametized constructor ");
    }
    circle(int r){
        System.out.println("i am a constructor of circle");
        this.radius=r;
    }
    public int radius;
    
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class cylinder1 extends circle{
    cylinder1(int r,int h) {
        super(r);// if i remove super then it will work as default as...
        System.out.println("i am a cylinder paremetrized constructor");
        this.height=h;

    }
    public int height;
    public double volume(){
        
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class practice_set_oop {
    public static void main(String[] args) {
    //problem 1:-----------------------------------
    cylinder1 obj =new cylinder1(12,4);
    System.out.println(obj.volume());

    }
    
}
