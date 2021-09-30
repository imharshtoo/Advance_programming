/* package practice_of_java;

import java.util.Scanner;
import java.util.Random;
public class java_stone_paper {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        int upperbound=4;
        int computer=rand.nextInt(upperbound);
        int player=input.nextInt(upperbound);
        int stone=1;
        int paper=2;
        int scissor=3;
        if(computer==player) {
            System.out.println("Draw");
        }
        else if (computer==stone && player==paper){
            System.out.println("computer wins");
        }
        else if(computer ==paper && player==stone) {
            System.out.println("player wins");

        }
        else if(computer==scissor && player==paper){
            System.out.println("computer wins");
        }
        else  if (player==scissor && computer==paper){
            System.out.println("Player wins");
        }
        else if(computer==scissor && player ==stone){
            System.out.println("player wins");

        }
        else if(computer==stone && player==scissor){
            System.out.println("computer wins");

        }
        System.out.println("STONE==1");
        System.out.println("PAPER==2");
        System.out.println("SCISSOR==3");
        System.out.println(computer);
        System.out.println(player);
        
    }
    
}
 */