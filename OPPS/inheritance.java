package OPPS;

import javax.crypto.spec.PSource;

public class inheritance {
    public static void main(String[] args) {
//        Fish Shark = new Fish();
//        Shark.eat();
        dogs dobby =new dogs();
        dobby.eat();
       dobby.breath();
       dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
 //base class
    class Animal{
        String color;
        void eat(){

            System.out.println("eats");
        }
        void breath(){
            System.out.println("breath");
        }
    }

    class mammals extends Animal{
    int legs;
    }

    class dogs extends Animal{
        int legs;
        String breed;
    }

    //derived class
    class Fish extends Animal{
        void swim(){
            System.out.println("Swims in water");
        }
    }

    class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
    }

