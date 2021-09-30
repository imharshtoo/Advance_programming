package practice_of_java;

public class practice2 {
    public static void main(String[] args) {
        //String name= "h a rsh  kashyap";
        //name=name.replace(" ", "/");
        //System.out.println(name);
        //problem 2:
        String name="Dear <|name|>,THanks a lot.";
        name=name.replace("<|name|>", "Harsh");
        System.out.println(name);
        //problem 3:
        String s=" my name is  harsh  kashyap and what is your name.";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
        //problem 4:
        String letter ="Dear Harsh,\n\tthis java course is nice.\nthanks";
        System.out.println(letter);

    }
    
}
