package chess;
public class King extends Piece {
    public King(Color color){ super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        return Math.abs(dr-sr)<=1 && Math.abs(dc-sc)<=1;
    }
}
