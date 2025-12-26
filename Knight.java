package chess;
public class Knight extends Piece {
    public Knight(Color color){ super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        int r=Math.abs(dr-sr), c=Math.abs(dc-sc);
        return r*c==2;
    }
}
