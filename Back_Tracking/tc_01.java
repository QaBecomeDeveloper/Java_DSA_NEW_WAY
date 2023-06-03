package Back_Tracking;

import javax.swing.plaf.IconUIResource;

public class tc_01 {

    public static void findSubset(String str, String ans, int i){
        //base case
        if (i==str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);
    }

    public static void findPermutaion(String str,String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i=0; i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"==>"ab" + "de"="abde"
            String Newstr=str.substring(0,i)+str.substring(i+1);
            findPermutaion(Newstr,ans+curr);

        }

    }

    //N queens ==> place N Queens on an N*N Chessboard such that no two queens can attack each other.
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i=row-1;i>=0;i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal up
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal up
        for (int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board[][],int row){
        //base case
        if (row==board.length){
            //printBoard(board);
            count++;
            return true;
        }
        //column loop
        for (int j=0;j<board.length;j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;

    }
    public static void printBoard(char board[][]){
        System.out.println("-------------Chess board-------------");
        for (int i=0;i< board.length;i++){
            for (int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;

    public static void main(String[] args) {
        //String str="abc";
        //findSubset(str,"",0);
        //findPermutaion(str,"");
        int n=2;
        char board[][]=new char[n][n];
        //initialize
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

       if(nQueens(board,0)){
           System.out.println("solution is possible");
               printBoard(board);
           }else {
           System.out.println("Solution isn't possible");
       }
    }
}
