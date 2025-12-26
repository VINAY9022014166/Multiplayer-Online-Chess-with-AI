package chess;
public class Bishop extends Piece {
    public Bishop(Color color){ super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        return Math.abs(dr-sr)==Math.abs(dc-sc);
    }
}
