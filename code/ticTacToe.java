import java.util.*;

// Wilson Handojo_2802540162_PPTI 21

 class Game{
    char board[][] = new char[5][5];

    void initializeBoard(){
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                board[i][j] = '-';
            }
        }
    }

    void printBoard(){
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void play(){
        initializeBoard();
        Scanner in = new Scanner (System.in);
        int count = 0;
        while (true){
            int a,b;
            printBoard();
            if (count % 2 != 0){
                do{
                    System.out.print("What position will player X take : ");
                    a = in.nextInt();
                    b = in.nextInt();
    
                } while ((a < 1 || a > 3) && (b < 1 || b > 3));
    
                    if(board[a-1][b-1] == '-'){
                        board[a - 1][b - 1] = 'X';
                    }
    
                    else {
                        do { 
                            System.out.print("Please input again : ");
                            a = in.nextInt();
                            b = in.nextInt();
                        } while ((a < 1 || a > 3) && (b < 1 || b > 3) && (board[a - 1][b - 1] != '-'));
    
                        board[a - 1][b - 1] = 'X';
                    }
        }

        else{

            do{
                System.out.print("What position will player O take : ");
                a = in.nextInt();
                b = in.nextInt();

            } while ((a < 1 || a > 3) && (b < 1 || b > 3));

                if(board[a-1][b-1] == '-'){
                    board[a - 1][b - 1] = 'O';
                }

                else {
                    do { 
                        System.out.print("Please input again : ");
                        a = in.nextInt();
                        b = in.nextInt();
                    } while ((a < 1 || a > 3) && (b < 1 || b > 3) && (board[a - 1][b - 1] != '-'));

                    board[a - 1][b - 1] = 'O';
                }
                
        }

        int flag = 0;

        if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
            (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
            (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
            (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
            (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
            (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
            (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')){
                flag = 1;
                printBoard();
                System.out.println("====================");
                System.out.println("The X is the winner!");
                return;
            }
            
            else if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
                     (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
                     (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
                     (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
                     (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
                     (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                     (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')){
                        flag = 1;
                        printBoard();
                        System.out.println("====================");
                        System.out.println("The O is the winner!");
                        return;
                    }
            
            int temp = 0;
            for (int i = 0 ; i < 3 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    if (board[i][j] != '-'){
                        temp++;
                    }
                }
            }

            if(temp == 9 && flag == 0){
                printBoard();
                System.out.println("The game is draw...");
                return;
            }

        count++;
    }
    }
 }

public class ticTacToe {
    public static void main(String args[]){
        Game game = new Game();
        game.play();
    }
}
