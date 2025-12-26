package chess;
public class Pawn extends Piece {
    public Pawn(Color color) { super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        int d = (color==Color.WHITE)?-1:1;
        return sc==dc && b.getPiece(dr,dc)==null && dr-sr==d;
    }
}
