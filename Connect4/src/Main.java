import java.util.Scanner;

public class Main {

    int player;




    public static void main(String[] args) {

        //Setting up a new board
        Board playboard = new Board();


   boolean status = playboard.win_check();


        while (status!= true) {

        // Player X plays

            Input player_X = new Input();
            int row_X = player_X.get_input_X();

            playboard.set_row(1, row_X);
            status=playboard.win_check();
            //System.out.println("Player X " + status);

            if (status == true){
                break;
            }
            else {

        // Player O plays
                Input player_O = new Input();
                int row_O = player_O.get_input_O();

                playboard.set_row(2, row_O);
                status = playboard.win_check();
                //System.out.println("Player O " + status);

            }
        }
    }
}

