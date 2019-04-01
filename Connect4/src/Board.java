public class Board {

    int max = 8;

    // setting up initial board
    char[][] playboard = {
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'}};

    void show(){

     System.out.println("1 2 3 4 5 6 7 8");

       for (int i = 0; i < playboard.length; i++){

           for (int j =0; j < playboard[i].length; j++){
               System.out.print(playboard[i][j]+ " ");
           }

       System.out.println();
       }
     System.out.println("1 2 3 4 5 6 7 8\n\n");

     }

     // Get the right user and a sign from him to modify the board
    void set_row(int player, int in_row){
        char sign;
        int max=7;
        int row =in_row-1;
        if(player==1){
            sign ='X';
        }
        else {
           sign ='O';
        }

        while (playboard[max][row]=='X'|| playboard[max][row]=='O'){
            max--;
        }
        playboard[max][row]=sign;

        // Show modified board
        show();
    }

// Horizontal check X
    public boolean win_check_X_H(){
        int counter=0;
       boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if ((playboard[i][j] =='X')){
                  counter=counter+1;
                }
                    else{
                        counter=0;
                    }
                        if(counter==4){
                            flag=true;
                            System.out.println("X wins");
                        }
            }
        }
    return  flag;
    }


// Vertical check X
   public boolean win_check_X_Vertical(){
        int counter=0;
        boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if (( playboard[i][j] =='X') &&
                (playboard[i-1][j] =='X') &&
                (playboard[i-2][j] == 'X') &&
                (playboard[i-3][j] == 'X' )){

                    flag= true;
                    System.out.println("X wins");
                }
                else{
                    //flag = false;
                }

            }
        }
        return  flag;

    }


// Diagonal check X
  /*  public boolean win_check_X_diag(){
        int counter=0;
        boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if ((( playboard[i][j] =='X') &&
                        (playboard[i+1][j+1] =='X') &&
                        (playboard[i+2][j+2] == 'X') &&
                        (playboard[i+3][j+3] == 'X' )) ||
                          ((playboard[max][j] =='X') &&
                           (playboard[max-1][j+1] == 'X')       )){

                    flag= true;
                    System.out.println("X wins");
                }
                else{
                    //flag = false;
                }

            }
        }
        return  flag;

    }

*/





// Vertical check O
    public boolean win_check_O_Vertical(){
        int counter=0;
        boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if (( playboard[i][j] =='O') &&
                        (playboard[i-1][j] =='O') &&
                        (playboard[i-2][j] == 'O') &&
                        (playboard[i-3][j] == 'O' )){

                    flag= true;
                    System.out.println("O wins");
                }
                else {
                    //flag = false;
                }
            }
        }
        return  flag;

    }



// Horizontal check O
    public boolean win_check_O_H(){
        int counter=0;
        boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if ((playboard[i][j] =='O')){
                    counter=counter+1;
                }
                else{
                    counter=0;
                }
                if(counter==4){
                    flag=true;
                    System.out.println("O wins");
                }
            }
        }
        return  flag;
    }


// Diagonal check O
 /*   public boolean win_check_O_diag(){
        int counter=0;
        boolean flag=false;

        for (int i = 0; i < playboard.length; i++){

            for (int j =0; j < playboard[i].length; j++)
            {
                if ((( playboard[i][j] =='O') &&
                        (playboard[i+1][j+1] =='O') &&
                        (playboard[i+2][j+2] == 'O') &&
                        (playboard[i+3][j+3] == 'O' )) ||
                        ((playboard[max][j] =='O') &&
                                (playboard[max-1][j+1] == 'O')       )){

                    flag= true;
                    System.out.println("O wins");
                }
                else{
                    //flag = false;
                }

            }
        }
        return  flag;

    }*/


    public boolean win_check(){

        boolean win, win_X_H, win_X_V, win_X_diag, win_O_H, win_O_V, win_O_diag =false;

        win_X_H = win_check_X_H();
        win_X_V = win_check_X_Vertical();
        //win_X_diag = win_check_X_diag();

        win_O_V = win_check_O_Vertical();
        win_O_H = win_check_O_H();
       // win_O_diag = win_check_O_diag();


        if((win_X_H == true) || ( win_X_V == true) || /*(win_X_diag == true) ||*/ ( win_O_H == true) || (win_O_V == true) || (win_O_diag == true)){
            win = true;
        }
        else {
            win = false;
        }


    return win;
    }
}
