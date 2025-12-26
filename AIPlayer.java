package chess;
public class AIPlayer extends Player {
    public AIPlayer(Color color){ super(color); }
    public void makeMove(Board b){ b.move(1,0,2,0); }
}
