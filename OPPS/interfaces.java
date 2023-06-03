package OPPS;

public class interfaces {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        king k=new king();
        k.moves();

    }
}
interface  chessPlayer{
    void moves();

}
class queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(all 4 direction)");
    }

}
class rock implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class king implements chessPlayer{

    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by 1 steps)");

    }
}

