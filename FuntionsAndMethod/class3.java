package FuntionsAndMethod;

public class class3 {

    public static void swap(int a, int b){

        int temp =a;
        a=b;
        b=temp;
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }

    public static int multiply(int a, int b){
        int product =a*b;
        return product;
    }

    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++ ) {
            f= f*i;
        }
        return f;

    }

    public static int binomialcofficieant(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr= factorial(n-r);
        int bincoff= fact_n/(fact_r*fact_nmr);
        return bincoff;
    }

    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //fun to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
//
//    public static boolean isPrime(int n){
//        if (n==1){
//            return true;
//        } else if (n==2) {
//            return true;
//        }
//        for (int i=2; i<=n-1;i++) {
//            if (n % i == 0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void primeInrange(int n){
        for (int i=2; i<=n;i++){
            if (isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void bintodec(int binNum){
        int mynum =binNum;
        int pow =0;
        int decNum=0;
        while(binNum>0){
            int lastDigit =binNum%10;
            decNum =decNum+(lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum =binNum/10;
        }
        System.out.println("Decimal of " +mynum +" ="+decNum);
    }

    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binNum=0;
        while (n>0){
            int rem =n%2;
            binNum = binNum + (rem * (int)(Math.pow(10,pow)));
            pow++;
            n=n/2;

        }
        System.out.println("Bin form of "+ mynum +" = "+ binNum );
    }

    public static void main(String[] args) {
//        int a=5;
//        int b=10;
//        swap(a,b);
//       int prod= multiply(a,b);
//        System.out.println("product of a & b is :"+prod);
//        System.out.println(factorial(5));
//        System.out.println(binomialcofficieant(5,3));
//        System.out.println(sum(5,4));
//        System.out.println(sum(2,3,4));
//        System.out.println(sum(3.5f,5.5f));
//        System.out.println(isPrime(12));
        //primeInrange(20);
       // bintodec(10101);
        dectobin(12);


    }
}
