package chess;
public class Game {
    Board board=new Board();
    Player p=new Player(Color.WHITE);
    AIPlayer ai=new AIPlayer(Color.BLACK);
    public void play(){ board.move(6,0,5,0); ai.makeMove(board); }
}
