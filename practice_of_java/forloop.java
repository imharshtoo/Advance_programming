package practice_of_java;

public class forloop {
    public static void main(String[] args) {
        //break and continue:
        //for (int i=0;i<=10;i++){
          //  System.out.println(i);

        //}
        //odd nos
        //int n=5;
        //for (int i=0;i<=n;i++){
        //    System.out.println(2*i+1);
        //}
        //for (int i=100;i>=0;i--){
        //    System.out.println(i);
        //}
        //for (int i=0;i<5;i++){
        int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("ending");
                break;
            }
            i++;

        }
        System.out.println("loops ends");
    }
    
}
