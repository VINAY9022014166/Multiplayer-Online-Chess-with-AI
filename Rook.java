package chess;
public class Rook extends Piece {
    public Rook(Color color){ super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        return sr==dr || sc==dc;
    }
}
