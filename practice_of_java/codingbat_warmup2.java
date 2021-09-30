package practice_of_java;
public class codingbat_warmup2 {
    public static int stringMatch(String a, String b) {
      int count=0;
      int z=Math.min(a.length(),b.length());
      for(int i=0;i<z-1;i++){
        if(a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
      }
      return count;
    
    }
    public static void main(String[] args) {
        String a="xxcaazz";
        String b="xxbaaz";
        System.out.println(stringMatch(a,b));
        
    }

    
}
