package OPPS;

public class opps_one {
    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.name="gabbar";
        s1.rollNumber=234;
        s1.password="sushil123";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Stud s2=new Stud(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Stud {
    String name;
    int rollNumber;
    String password;
    int marks[];

    //deep copy constructor
    Stud(Stud s1) {
        marks = new int[0];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Stud() {
        System.out.println("constructor is called....");
    }

    Stud(String name) {
        this.name = name;
    }

    Stud(int rollNumber) {
        this.rollNumber = rollNumber;
    }

}

