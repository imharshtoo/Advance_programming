package practice_of_java;

class employe{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("ringinhg...");
    }
    public void vibrate(){
        System.out.println("vibrating....");
    }
}
class square{
    int side;
    public int area(){
        int z=side*side;
        return z;
    }
    public int perimeter(){
        int y=4*side;
        return y;
    }
}
public class practice_oops {
    public static void main(String[] args) {
/*         //problem1:-----------------------------
        employe harsh=new employe();
        harsh.setname("i love my family");
        System.out.println(harsh.getname());
        harsh.salary=344;
        System.out.println(harsh.getsalary());
        //problem2:-----------------------------
        cellphone vivov2025=new cellphone();
        vivov2025.ring();
        vivov2025.vibrate(); */

        //problem3:-------------------------------
        square input=new square();
        input.side=9;
        System.out.print("the area of square is ");
        System.out.println(input.area());
        System.out.print("the perimeter of square is ");
        System.out.print(input.perimeter());
        
    }
    
}
