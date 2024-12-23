public class test {
    public boolean isWinner(char sym){
        if(checkRow(sym) || checkCol(sym) || checkDiagonal(sym)){
            return true;
        }

        return false;
    }

    private boolean checkRow(char sym){
        for(int i  = 0; i<size; i++){
            if(checkRow(i, sym)) return true;
        }
        return false
    }

    private boolean checkRow(int row, char sym){
        for(int i = 0; i<size; i++){
            if(this.board[row][i] != sym)   return false;
        }
        return true;
    }
}
