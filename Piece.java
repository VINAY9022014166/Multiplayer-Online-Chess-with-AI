package chess;
public abstract class Piece {
    protected Color color;
    public Piece(Color color) { this.color = color; }
    public Color getColor() { return color; }
    public abstract boolean isValidMove(Board board, int sr, int sc, int dr, int dc);
}
