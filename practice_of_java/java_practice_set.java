package practice_of_java;
class cylinder{
    Float height;
    float radius;
    public Float getHeight(){
        return height;
    }
    public void setHeight(Float height){
        this.height=height;
    }
    public float getRadius(){
        return radius;
}
    public void setRadius(float radius){
        this.radius=radius;

}
    public double surfacearea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class java_practice_set {
    public static void main(String[] args) {
        //problem 1:
        cylinder input=new cylinder();
        input.setHeight(9.0f);
        input.setRadius(12);
        System.out.println(input.getRadius());
        System.out.println(input.getHeight());
        System.out.println(input.surfacearea());
        System.out.println(input.volume());
    }
    
}
