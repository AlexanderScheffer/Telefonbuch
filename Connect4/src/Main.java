import java.util.Scanner;

public class Main {

    int player;




    public static void main(String[] args) {

        //Setting up a new board
        Board playboard = new Board();


   boolean status = playboard.win_check();
        //boolean win=false;

        while (status!= true) {

        // Player X plays
            Player player_X = new Player();
            int row_X = player_X.get_input_X();
            playboard.set_row(1, row_X);
            status=playboard.win_check();
            //System.out.println(status);


        // Player O plays
            Player player_O = new Player();
            int row_O = player_O.get_input_O();
            playboard.set_row(2, row_O);
            status=playboard.win_check();
            //System.out.println(status);


        }
    }
}

