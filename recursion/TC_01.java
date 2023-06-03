package recursion;

public class TC_01 {
    public static void printDesc(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDesc(n-1);
    }
    public static void printInc(int n){
        if (n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");

    }
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn =n * fact(n-1);
        return fn;
    }


    public static void main(String[] args) {
        int n=10;
        //printDesc(n);
       // printInc(n);
        System.out.println(fact(5));
    }
}
