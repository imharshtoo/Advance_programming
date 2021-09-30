/* package practice_of_java;
import java.util.Scanner;

import java.util.Random;

class game{
    public int number;
    public int inputnumber;
    public int noofguesses=0;
    public int getnoofguesses(){
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }
    game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }
    boolean iscorrectnumber(){
        noofguesses++;
        if (inputnumber==number){
            System.out.format("yes you guessed it right,it was %d\n you guessed it in %d attempts",number,noofguesses);
            return true;
        }
        else if(inputnumber>number){
            System.out.println("too high...");
        }
        else if(inputnumber<number){
            System.out.println("too low...");
        }
        return false;
    }
}

public class guess_the_number {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
        g.takeuserinput();
        b=g.iscorrectnumber();
        }
        
    }
    
}
 */