package recursion;

public class tc_02 {

    //print nth fibonacci number
    public  static  int fib(int n){
        if (n==0 || n==1){
            return 1;
        }

        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn =fnm1+fnm2;
        return fn;
    }

    //check array is shorted or not

    public static boolean is_shorted(int arr[], int i){
        if (i== arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }

        return is_shorted(arr, i+1);
    }

    //waf to find the first occurrence of an element in an array.
    public static int firstOccurence(int arr[],int key, int i){
            if (i== arr.length){
                return -1;
            }
        if (arr[i]==key){
            return i;
        }
         return firstOccurence(arr, key, i+1);
    }

    //waf to find the last occurrence of an element in an array.
    public static int lastOccurence(int arr[],int key, int i){
        if (i== arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if (isFound!=-1 &&  arr[i]==key){
            return i;
        }
        return isFound;
        }
        //x to the power n
    public static int power(int x,int n){
         if (n==0){
             return 1;
         }
         int xnm1=power(x,n-1);
        int xn= x*xnm1;
        return xn;
    }

    public static int optimizedpowezr(int a, int n){
        if (n==0){
            return 1;
        }
        int halfpowersqr=optimizedpowezr(a,n/2)*optimizedpowezr(a,n/2);
        if (n%2 !=0){
            halfpowersqr=a*halfpowersqr;

        }
        return halfpowersqr;

    }

//    //tiling problem
//    give a "2xn" board and tiles of size "2x1", count the number of ways to tile the given board using the 2x1 tiles
//            (a tiles can be placed vertical and horizontal)
    public static int tilingproblen(int n){ //2xn (flore size)
        //base case
           if (n==0 || n==1){
            return 1;
        }
        int fnm1=tilingproblen(n-1);
        int fnm2=tilingproblen(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }

    //remove duplicate from string
    public static void removeduplicate(String str,int idx, StringBuilder newstr, boolean map[]){
        if (idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if (map[currchar-'a']==true){
            removeduplicate(str,idx+1,newstr,map);

        }else {
            map[currchar-'a']=true;
            removeduplicate(str, idx, newstr.append(currchar), map);
        }

    }

    //Friend Pairing Problem
    //given n friends, each one can remain single or can be paired up with some other friends . each friend can be paired only once.
    //find the total no of ways in which friends can remain single or can be paired up.

    public static int friendspairing(int n){
        if (n==1||n==2){
            return n;

        }
        return friendspairing(n-1)+(n-1)*friendspairing(n-2);
//        int fnm1=friendspairing(n-1);
//        int fnm2=friendspairing(n-2);
//        int pairways=(n-1)*fnm2;
//        int totlways=fnm1+pairways;
//        return totlways;
//
    }

    //binary string problem

    //print all binary string of size n without consecutive once.
    public static void printBinString(int n, int lastPlace, StringBuilder str){
//        if (lastPlace==0){
//            //sit 0 on chair n
//            printBinString((n-1,0,str.append("0"));
//            printBinString(n-1,1,str.append("1"));
//            printBinString(n-1,0,str.append("0"));
//        }else {
//            printBinString(n-1,0,str.append("0"));
//        }

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str.append("0"));
        if (lastPlace==0){
            printBinString(n-1,1,str.append("1"));
        }

    }
    public static void main(String[] args) {
        //int n=5;
        //System.out.println(fib(n));

        //int arr[]={5,5,5,5};
        //System.out.println(is_shorted(arr,0));
        //System.out.println(firstOccurence(arr,5,0));
        //System.out.println(lastOccurence(arr,5,0));
        //System.out.println(power(5,2));
        //System.out.println(optimizedpowezr(5,3));
        //System.out.println(tilingproblen(2));
       // String str="appnacollege";
        //removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
        //System.out.println(friendspairing(3));
        printBinString(3,0,new StringBuilder(""));

    }

}
