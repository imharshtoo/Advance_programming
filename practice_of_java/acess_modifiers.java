package practice_of_java;

class myemployee{
   private int id;
   private String name;
   public String getName(){
       return name;
   }
   public void setName(String n){
       name=n;
}
    public void setid(int i){
         id=i;
    }
    public int getid(){
        return id;
    }

}
public class acess_modifiers {
    public static void main(String[] args) {
        myemployee harsh=new myemployee();
        harsh.setName("harsh kashyap");
        System.out.println(harsh.getName());
        harsh.setid(245);
        System.out.println(harsh.getid());
    }
    
}
