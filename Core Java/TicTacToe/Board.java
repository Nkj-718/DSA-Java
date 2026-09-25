package TicTacToe;
class Board {
    private char[][] playingBoard;
    
    Board(){
        playingBoard = new char[3][3];
    }

    void showBoard(){
        int count=0;
        for(int i=0; i<playingBoard.length; i++){
            for(int j=0; j<playingBoard[i].length; j++){
                count++;
                if(playingBoard[i][j]!='X' && playingBoard[i][j]!='O'){
                    System.out.print(count + " ");
                }
                else{
                    System.out.print(playingBoard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    boolean isBoardFull(){
        for(char[] i : playingBoard){
            for(char j : i){
                if(j!='X' && j!='O')
                    return false;
            }
        }

        return true;
    }

    boolean checkWin(char playerMark){

        if(playingBoard[0][0]==playerMark && playingBoard[1][1]==playerMark && playingBoard[2][2]==playerMark)
            return true;
        
        if(playingBoard[0][2]==playerMark && playingBoard[1][1]==playerMark && playingBoard[2][0]==playerMark)
            return true;

        for(int i=0; i<playingBoard.length; i++){
            if(playingBoard[i][0]==playerMark && playingBoard[i][1]==playerMark && playingBoard[i][2]==playerMark)
                return true;

            if(playingBoard[0][i]==playerMark && playingBoard[1][i]==playerMark && playingBoard[2][i]==playerMark)
                return true;
        }
        return false;
    }

    void recordWin(Player player){
        player.increaseWins();
        System.out.println(player.getPlayerName() + " WINS!");
    }

    int calculateRow(int position){
        return (position-1)/3;
    }

    int calculateColumn(int position){
        return (position-1)%3;
    }
    
    boolean isValid(int position){
        if(position<1|| position>9){
            System.out.println("Invalid position! Enter a number from 1 to 9.");
            return false;
        }

        int row=calculateRow(position);
        int col=calculateColumn(position);

        if(playingBoard[row][col]=='X' || playingBoard[row][col]=='O'){
            System.out.println("Invalid! Position " + position + " is already marked as " + playingBoard[row][col]);
            return false;
        }
        return true;
    }

    void placeMark(int position, char mark){
        int row=calculateRow(position);
        int col=calculateColumn(position);
        playingBoard[row][col]=mark;
    }
    
}
