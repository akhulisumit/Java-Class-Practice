package tictactoegame;

public class game {
    board board;
    player player1;
    player player2;

    public game(int size) {
        this.board = new board(size);
        this.player1 = new player('X');
        this.player2 = new player('O');
    }

    public void launch(){
        int n = this.board.size;
        int turn = n*n;
        while(turn > 0){
            if(turn == n*n) {
                board.printBoard();
            }
            player1.makeMove(board);
            turn--;
            board.printBoard();
            if(board.isWinner(player1.symbol)){
                System.out.println("Player " + player1.symbol + " wins!");
                break;
            }
            
            if(turn <= 0){
                System.out.println("The game ended in a draw");
                break;
            } 
            player2.makeMove(board);
            turn--;
            board.printBoard();
            if(board.isWinner(player2.symbol)){
                System.out.println("Player " + player2.symbol + " wins!");
                break;
            }
            
            if(turn <= 0){
                System.out.println("The game ended in a draw");
                break;
            }
        }   
    }
}
