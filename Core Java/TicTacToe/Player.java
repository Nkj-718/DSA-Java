package TicTacToe;

class Player {
    private String playerName;
    private char playerMark;
    private int wins;

    Player(String playerName, char playerMark){
        this.playerName=playerName;
        this.playerMark=playerMark;
        wins=0;
    }

    void increaseWins(){
        wins++;
    }

    void showScore(){
        System.out.println(playerName + ": " + wins + " Wins.");
    }

    String getPlayerName(){
        return playerName;
    }

    char getPlayerMark(){
        return playerMark;
    }

}
