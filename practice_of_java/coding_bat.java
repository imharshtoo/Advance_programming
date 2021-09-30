package practice_of_java;

public class coding_bat {
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0,3).equals("not")){
          return str;
        }
        return "not "+str;
      }
    public static void main(String[] args) {
        String str="not candy";
        System.out.println(notString(str));
    }
    
}
