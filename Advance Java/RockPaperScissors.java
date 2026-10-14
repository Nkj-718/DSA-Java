enum Move{
    ROCK, PAPER, SCISSORS;
}

class RockPaperScissors {
    public static void main(String[] args) {
        Move player1=Move.SCISSORS;
        Move player2=Move.PAPER;
        
        if(player1==Move.ROCK && player2==Move.SCISSORS)
            System.out.println("Player1 wins!");
        else if(player1==Move.PAPER && player2==Move.ROCK)
            System.out.println("Player1 wins!");
        else if(player1==Move.SCISSORS && player2==Move.PAPER)
            System.out.println("Player1 wins!");
        else if(player1==Move.ROCK && player2==Move.PAPER)
            System.out.println("Player2 wins!");
        else if(player1==Move.PAPER && player2==Move.SCISSORS)
            System.out.println("Player2 wins!");
        else if(player1==Move.SCISSORS && player2==Move.ROCK)
            System.out.println("Player2 wins!");
        else
            System.out.println("DRAW!");
    }
}
