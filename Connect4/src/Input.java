import java.util.*;

public class Input {
 int player=0;
    public int get_input_X() {
        player = 1;
        System.out.println("X is playing!!! Please set row for putting a Number [1..8] in it:");
        Scanner Input_X = new Scanner(System.in);
        int X = Integer.parseInt(Input_X.nextLine());

            if ((X<1) || (X>8)){
               System.out.println("Wrong X-input Value. Make a correct input!");
        }

        return X;
    }

    public int get_input_O(){
        player=2;
        System.out.println("O is playing!!! Please set row for putting a Number [1..8] in it:");
        Scanner Input_O =new Scanner(System.in);
        int O = Integer.parseInt(Input_O.nextLine());



        if ((O<1) || (O>8)){
            System.out.println("Wrong O-input Value. Make a correct input!");
        }

        return O;

    }


}
