package chess;
public class Queen extends Piece {
    public Queen(Color color){ super(color); }
    public boolean isValidMove(Board b,int sr,int sc,int dr,int dc){
        return sr==dr||sc==dc||Math.abs(dr-sr)==Math.abs(dc-sc);
    }
}
