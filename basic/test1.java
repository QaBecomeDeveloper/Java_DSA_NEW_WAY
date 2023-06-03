package basic;

import java.util.Scanner;

public class test1 {

    //Reverse String without using reverse function and -- in loop
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String");
        String str = myObj.next();
        String r = "";
        char ch;

        for(int i=0; i<str.length(); i++) {
            ch =str.charAt(i);
            r =ch+r;
        }
        System.out.println("revers word :" +r);
    }

}
