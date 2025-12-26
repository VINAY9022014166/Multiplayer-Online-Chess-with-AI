package chess;
import java.util.Stack;
public class Board {
    private Piece[][] b=new Piece[8][8];
    Stack<Move> undo=new Stack<>();
    public Board(){ b[6][0]=new Pawn(Color.WHITE); b[1][0]=new Pawn(Color.BLACK); }
    public Piece getPiece(int r,int c){ return b[r][c]; }
    public boolean move(int sr,int sc,int dr,int dc){
        Piece p=b[sr][sc];
        if(p!=null && p.isValidMove(this,sr,sc,dr,dc)){
            undo.push(new Move(sr,sc,dr,dc,b[dr][dc]));
            b[dr][dc]=p; b[sr][sc]=null; return true;
        } return false;
    }
}
