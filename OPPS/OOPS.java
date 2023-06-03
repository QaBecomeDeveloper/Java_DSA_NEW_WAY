package OPPS;

import java.awt.*;

public class OOPS {
    public static void main(String[] args) {
//        Pen p1=new Pen();//created Pen object
//        p1.setColor("Blue");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());
//       // p1.setColor("Yellow");
//        p1.setColor("Yellow");
//        System.out.println(p1.getColor());
//
//        BankAccount myAcc=new BankAccount();
//        myAcc.UserName="Sushil";
//        myAcc.setPassword("Sushil123");
        Students s1=new Students();
       // Students s2=new Students("Ramlal");
        // Students s3=new Students(123);
        s1.name="gabbar";
        s1.rollNumber=234;
        s1.password="sushil123";
//       // Students s2=new Students(s1);
//        //s2.password="xcv";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Students s2=new Students(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Students{
    String name;
    int rollNumber;
    String password;
    int marks[];
    //shallow copy constructor
//    Students(Students s1){
//        this.name=s1.name;
//        this.rollNumber=s1.rollNumber;
//        this.marks= s1.marks;
//
//    }
    //deep copy constructor
    Students (Students s1){
        marks =new int[3];
        this.name=s1.name;
        this.rollNumber= s1.rollNumber;
        for (int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Students(){
        System.out.println("constructor is called....");
    }
    Students(String name){
        this.name=name;
    }
    Students(int rollNumber){
        this.rollNumber=rollNumber;
    }
}

class BankAccount{
    public String UserName;
    private String password;

    public void setPassword(String pwd) {
        password=pwd;
    }
}
class Pen{
   private String color;
   private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void  setColor(String newColor){

        color=newColor;
    }
    void  setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String Name;
    int age;
    float percentage;//cgpa
    void calPercentage(int phy, int math, int chem){
        percentage=(phy+math+chem)/3;
    }
}



