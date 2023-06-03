package loops;

public class breakstat {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}
