package TicTacToe;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean playAnotherGame;
        int choice;

        Player[] player=new Player[2];

        System.out.print("Enter Player 1 Name: ");
        String player1=sc.next();
        player[0]=new Player(player1, 'X');

        System.out.print("Enter Player 2 Name: ");
        String player2=sc.next();
        player[1]=new Player(player2, 'O');

        do{
            player[0].showScore();
            player[1].showScore();
            System.out.println(player[0].getPlayerName() +" VS " + player[1].getPlayerName());
            System.out.println("BEGIN!!!");
            Board board=new Board();
            
            boolean roundOver=false;
            while(!roundOver){
                for(int i=0; i<2;){
                    board.showBoard();
                    int position;
                    
                    if(board.isBoardFull()){
                        roundOver=true;
                        System.out.println("It's a Draw!");
                        break;
                    }

                    do{
                        System.out.print("Enter Position no. to place your mark: ");
                        position=sc.nextInt();
                    }while(!board.isValid(position));

                    board.placeMark(position, player[i].getPlayerMark());

                    if(board.checkWin(player[i].getPlayerMark())){
                        board.recordWin(player[i]);
                        roundOver=true;
                        board.showBoard();
                        break;
                    }

                    i=(i==1)? 0 : 1;
                }
            }
            
            do{
                System.out.println("Do you want to play another game?");
                System.out.println("1.Yes    2.No");
                System.out.print("Choice: ");
                choice=sc.nextInt();
            }while(choice!=1 && choice!=2);

            playAnotherGame=(choice==1);

        }while(playAnotherGame);

        sc.close();
    }    
}
