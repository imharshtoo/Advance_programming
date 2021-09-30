package practice_of_java;

public class java12 {
    public static void main(String[] args) {
        String name="Harry";
        //System.out.println(name);
        int value= name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String nontrimmed ="     Harry     ";
        System.out.println(nontrimmed);
        System.out.println(nontrimmed.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,4));
        System.out.println(name.replace("r","p"));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.startsWith("pa"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.endsWith("Ha"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ry"));
        String name1="Harryrryrry";
        //System.out.println(name1.indexOf("rry",4));
        System.out.println(name1.lastIndexOf("rry",4));
        System.out.println(name1.lastIndexOf("rry",7));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harry"));
        System.out.println("hi! my name is \n harsh");

    }
    
}
