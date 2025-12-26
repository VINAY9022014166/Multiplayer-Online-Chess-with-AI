package chess;

import javax.swing.*;
import java.awt.*;

public class ChessSwingUI extends JFrame {

    private JButton[][] cells = new JButton[8][8];
    private Board board;

    public ChessSwingUI(Board board) {
        this.board = board;
        setTitle("Multiplayer Online Chess with AI");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        initializeBoard();
        setVisible(true);
    }

    private void initializeBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                JButton btn = new JButton();
                btn.setFont(new Font("Arial", Font.BOLD, 24));

                // Chessboard color
                if ((row + col) % 2 == 0)
                    btn.setBackground(new Color(240, 217, 181));
                else
                    btn.setBackground(new Color(181, 136, 99));

                Piece piece = board.getPiece(row, col);
                if (piece != null) {
                    btn.setText(piece.getClass().getSimpleName().substring(0, 1));
                }

                cells[row][col] = btn;
                add(btn);
            }
        }
    }

    // Refresh board after move
    public void refresh() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = board.getPiece(r, c);
                cells[r][c].setText(p == null ? "" :
                        p.getClass().getSimpleName().substring(0, 1));
            }
        }
    }
}
