package OPPS;

public class Abstract {
    public static void main(String[] args) {
//        Horse h= new Horse();
//        h.eat();
//        h.walk();
//        Chicken c =new Chicken();
//        c.eat();
//        c.walk();
//        System.out.println(h.color);
//        System.out.println(c.color);
        Mustang myHorse=new Mustang();
        //Anim-->Horse--->Mustang


    }
}

abstract class Anim{
    String color;
    Anim(){
        System.out.println("Anim constructor called......");
       color ="brown";
    }
    Void eat(){
        System.out.println("animal eats");
        return null;
    }
    abstract void walk();
}

class Horse extends Anim{
    Horse(){
        System.out.println("Horse constructor called......");
    }
    void  changeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Anim{

    Chicken(){
        System.out.println("Chicken constructor called......");
    }
    void  changeColor(){
        color="Red and White";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called......");
    }
}
