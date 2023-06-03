package OPPS;

public class polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(3,4));
        System.out.println(cal.sum((float) 4.5,(float) 5.5));
        System.out.println(cal.sum(3,4,5));

        Deer d=new Deer();
        d.eat();
    }

}
class Animals{
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}
