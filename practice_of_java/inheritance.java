package practice_of_java;


class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base setting x now");
        this.x=x;
    }
    public void PrintMe(){
        System.out.println("I am a constructor");
    }

}
class derived extends base{
    public int Y;
    public int getY(){
        return Y;
    }
    public void setY(int Y){
        this.Y=Y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(23);
        System.out.println(b.getX());
        derived d=new derived();
        d.setX(34);
        System.out.println(d.getX());
        
    }
    
}
