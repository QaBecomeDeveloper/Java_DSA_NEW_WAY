package Arrays;

import java.util.HashSet;

public class Arrays {

    public static void updatemarks(int[] Marks) {
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i< numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i< numbers.length;i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static int binarySearch(int numbers[], int key){
        int start =0, end=numbers.length-1;
        while(start<=end){

            int mid = (start+end)/2;
            /* comparison */
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return-1;
    }

    public static void reverse(int numbers[]){
        int first=0,last= numbers.length-1;
        while (first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static boolean printpairs(int[] numbers){
        int tp=0;
        for (int i=0;i< numbers.length;i++){
            int curr=numbers[i];
            for (int j=i+1;j< numbers.length;j++){
                System.out.println("("+curr+","+numbers[j]+")");
                tp++;

            }

            System.out.println();
        }
        System.out.println("total pairs "+tp);
       return true;
    }

    public boolean containsDuplicate(int[] numbers) {
        for(int i=0; i<numbers.length-1 ; i++) {
        for(int j=i+1; j<numbers.length ; j++ ) {
            if( numbers[i] == numbers[j] ) {
                return true ;
            }
        }
        }
        return false;
    }

    public boolean containsDuplicates(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
        if(set.contains(numbers[i]))
        {
            return true;
        } else {
            set.add(numbers[i]);
        }
    }
        return false;
    }

    public static void printsubarrays(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                currsum=0;
                for (int k=start;k<=end;k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;

                }
            }
        }
        System.out.println("max sum = "+ maxsum);
    }
public static void prifixsum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prifix[]=new int [numbers.length];
        prifix[0]=numbers[0];
        //calculate prefix array
        for (int i=1;i<prifix.length;i++){
            prifix[i]=prifix[i-1]+numbers[i];
            for (int k=0;k<numbers.length;k++){
                int start =k;
                for (int j=i;j< numbers.length;j++){
                    int end =j;
                    currsum=start==0? prifix[end] : prifix[end]-prifix[start-1];
                    if(maxsum<currsum){
                        maxsum=currsum;
                    }
                }
            }
            System.out.println("max sum : " + maxsum);
        }
    }
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i< numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
//        int Marks[]=new int[100];
//        Scanner sc=new Scanner(System.in);
//        Marks[0]=sc.nextInt();
//        Marks[1]=sc.nextInt();
//        Marks[2]=sc.nextInt();
//        System.out.println("phy :" +Marks[0]);
//        System.out.println("Chem :" +Marks[1]);
//        System.out.println("Math :" +Marks[2]);
//        Marks[2]=100;
//        System.out.println("Math :" +Marks[2]);
//      update marks
//        int Marks[]={97,98,99};
//        updatemarks(Marks);
//        for (int i=0;i< Marks.length;i++){
//            System.out.println(Marks[i]+" ");
//
//        }
//        System.out.println();
//
//    }
        //linear search
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16,};
       // int key = 10;
//        int index = linearSearch(numbers, key);
//        if (index == -1) {
//            System.out.println("Not Found");
//
//        } else {
//            System.out.println("Key is at index : " + index);
//        }
//        System.out.println("largest number is :" + getlargest(numbers));
//        System.out.println("smallest number is :" + getsmallest(numbers));
        //System.out.println("index for key : "+binarySearch(numbers,key));
        //reverse(numbers);
//        for (int i=0;i< numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println();
         //System.out.println(printpairs(numbers));
         //printsubarrays(numbers);
        //prifixsum(numbers);
        kadanes(numbers);
    }
}
