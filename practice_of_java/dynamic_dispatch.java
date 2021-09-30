package practice_of_java;
class phone{
    public void welcome(){

        System.out.println("you are welcome");
    }
    public void name(){
        System.out.println("my name is java");
    }
    
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("apka swagat ha");
    }
    public void name(){
        System.out.println("my name is java class smartphone");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {
        //phone obj=new phone(); //this is allowed
        //smartphone obj =new smartphone();//this is allowed
        //obj.name();

        phone obj =new smartphone();//this is allowed;
        //smartphone obj=new phone();//it is not allowed
        obj.welcome();
        obj.name();    
    }
    
}
