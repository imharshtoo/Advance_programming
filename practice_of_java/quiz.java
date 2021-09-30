package practice_of_java;

class employee{
    int rollno;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my rollno is "+rollno);
        System.out.println("my name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class quiz {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee harsh=new employee();//instanting new employee object
        //settings attributes
        employee john=new employee();
        john.name="john kashyap";
        john.rollno=31;
        john.salary=35;
        harsh.rollno=34;
        harsh.salary=45;
        harsh.name="harsh rajput";
        harsh.printdetails();
        //printing the attributes
        //System.out.println(harsh.name);
        //System.out.println(harsh.rollno);
        john.printdetails();
        int salary=john.getsalary();
        System.out.println(salary);
    }

    
}
