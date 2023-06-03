package pattern_advance;

public class Advance_patter {
           public static void hollowrect(int totrows, int totcolm){

               //outer loop
               for (int i =1; i<=totrows;i++){
                   //inner loop
                   for (int j =1; j<=totcolm;j++){
                       //cell(i,j)
                       if (i==1 || i==totrows || j==1 || j==totcolm){
                           //boundary cell
                           System.out.print(" *");
                       }else {
                           System.out.print("  ");
                       }
                   }
                   System.out.println();
               }

        }
        public  static void inverted_rotated_half_pyramid(int n){
               //outer
               for (int i=1;i<=n;i++){
                 //spaces
                 for (int j=1;j<=(n-i);j++){
                     System.out.print("  ");
                 }
                 for (int j =1;j<=i;j++){
                     System.out.print(" *");
                 }
                   System.out.println();
               }
        }
        public static void inverted_half_pyramid_withNo(int n){
               for (int i =1;i<=n;i++){
                   for (int j =1; j<=n-i+1;j++){
                       System.out.print(j+ " ");
                   }
                   System.out.println();
               }
        }
        public static void floyd_trangle(int n){
               int counter=1;
               for (int i=1;i<=n;i++){
                   for (int j=1; j<=i;j++){
                       System.out.print(counter+ " ");
                       counter++;
                   }
                   System.out.println();
               }
        }
        public static void zero_one_triangle(int n){
               for (int i=1;i<=n;i++){
                   for (int j=1; j<=i;j++){
                       if ((i+j)%2==0){
                           System.out.print(" 1");
                       }else {
                           System.out.print(" 0");
                       }
                   }
                   System.out.println();
               }
        }
        public static void butter_fly(int n) {
            //outer loop
            //first half
            for (int i = 1; i <= n; i++) {
                //start - i
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                //space - 2*(n-i)
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                //star - i
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            //2nd half
            for (int i = n; i >= 1; i--) {
                //start - i
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                //space - 2*(n-i)
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                //star - i
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void solid_rohmbus(int n){
               for (int i=1; i<=n;i++){
                   for (int j=1;j<=(n-i);j++){
                       System.out.print("  ");
                   }
                   for (int j=1;j<=n;j++){
                       System.out.print(" *");
                   }
                   System.out.println();
               }

        }

        public static void hollow_ractange(int n){
               //outer loop
               for (int i =1;i<=n;i++){
                   //spaces
                   for (int j=1;j<=(n-i);j++){
                       System.out.print("  ");
                   }
                   //code of hollow ractangle for inner loop
                   for (int j=1;j<=n;j++){
                       if (i==1 || i==n || j==1 || j==n){
                           System.out.print(" *");
                       }
                       else {
                           System.out.print("  ");
                       }
                   }
                   System.out.println();
               }

        }
        public static void diamond(int n){
               //outer-first_half
               for (int i=1;i<=n;i++){
                   //space
                   for (int j=1;j<=n-i;j++){
                       System.out.print("  ");
                   }
                   for (int j=1; j<=(2*i)-1;j++){
                       System.out.print(" *");
                   }
                   System.out.println();
               }
               //second half
               for (int i=n; i>=1;i--){
                   //space
                   for (int j=1;j<=n-i;j++){
                       System.out.print("  ");
                   }
                   for (int j=1; j<=(2*i)-1;j++){
                       System.out.print(" *");
                   }
                   System.out.println();
               }

        }

    public static void main(String[] args) {
       // hollowrect(6,6);
       // inverted_rotated_half_pyramid(5);
       //inverted_half_pyramid_withNo(5);
        //floyd_trangle(4);
       //zero_one_triangle(5);
        //butter_fly(6);
        // solid_rohmbus(4);
        //hollow_ractange(4);
        //diamond(4);

           }
    }

