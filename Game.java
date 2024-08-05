import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private char[][] board;
    private boolean playerXTurn;

    public Game() {
        board = new char[3][3];
        playerXTurn = true;
        initializeBoard();
        initializeUI();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void initializeUI() {
        setTitle("Tic-Tac-Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                int row = i;
                int col = j;
                button.stFont(new Font("Arial", Font.PLAIN, 60));
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (board[row][col] == ' '&& !isGameOver()) {
                            board[row][col] = playerXTurn ? 'X' : 'O';
                            button.setText(String.valueOf(board[row][col]));
                            playerXTurn = !playerXTurn;
                            if (isGameOver()) {
                                JOptionPane.showMessageDialog(null, "Game Over! " + getWinner() + "wins!");
                            }
                        }
                    }
                });
                add(button);
            }
        }
    }
}

private boolean isGameOver() {
    return getWinner() != ' ' || isBoardFull();

}

private char getWinner() {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
            return board[0][i];
        }
        if (board[0][0] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {

        }
    }
    if (board[0][0] == board[1][1] && board)
}