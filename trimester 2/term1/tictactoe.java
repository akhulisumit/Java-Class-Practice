import java.util.Scanner;

class Board {
    private char[][] grid;

    // Constructor
    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
    }

    // Print the board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Make a move
    public boolean makeMove(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == '-') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    // Check for a win
    public boolean checkWin(char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) ||
                (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol)) {
                return true;
            }
        }
        // Check diagonals
        if ((grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) ||
            (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    // Check if the board is full
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

class Player {
    private char symbol;

    // Constructor
    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Game {
    private Board board;
    private Player player1, player2;
    private Player currentPlayer;

    // Constructor
    public Game() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
    }

    // Run the game
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        System.out.println("Welcome to Tic Tac Toe!");
        board.printBoard();

        while (!gameWon && !board.isFull()) {
            System.out.println("Player " + currentPlayer.getSymbol() + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                board.printBoard();
                if (board.checkWin(currentPlayer.getSymbol())) {
                    System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                    gameWon = true;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}

public class tictactoe {
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
