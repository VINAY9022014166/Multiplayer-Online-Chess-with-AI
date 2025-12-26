package chess;
public class Move {
    int sr,sc,dr,dc; Piece captured;
    public Move(int sr,int sc,int dr,int dc,Piece c){
        this.sr=sr; this.sc=sc; this.dr=dr; this.dc=dc; this.captured=c;
    }
}
