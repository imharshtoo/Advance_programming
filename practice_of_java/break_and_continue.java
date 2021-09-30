package practice_of_java;

public class break_and_continue {
    public static void main(String[] args) {
/*         for (int i=0;i<=10;i++){
            if (i==2){
            System.out.println("ending the loop");
            continue;
            }
            System.out.println(i);
            System.out.println("java is great"); */

        //}
        int i=0;
        do{
            if (i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
            i++;
        }while(i<5);
        System.out.println("loops ends here");
        
    }
    
}
