package OPPS;

public class TC_01 {
    public static void main(String[] args) {
        stud s1=new stud();
        s1.schoolName="JVM";
        stud s2=new stud();
        System.out.println(s2.schoolName);
        Hor h=new Hor();


    }
}

class Anima{
    Anima(){
        System.out.println("animal constructor is called");
    }
}

class Hor extends Anima{
    Hor(){
        super();
        System.out.println("horse constructor is called");
    }

}

class stud{
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name =name;
    }
    String getName(){
        return this.name;
    }
}