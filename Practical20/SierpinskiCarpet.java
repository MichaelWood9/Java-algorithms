package Practical20;

public class SierpinskiCarpet {
     static int size = 3;//this is the size of the board
     static char[][] board = new char [size][size];// this creates the board

    // the method below updates a row of a board
    public static void updaterow(int row,int column){
        if ( row  < 1){
            return;

        }

                board[column/size][row/size]= ' ';

                updaterow(row-1,column-1);

    }

    public static void carpet(int i){
        if (i < 1){
            return;
        }
        updaterow(i,i);

        carpet(i-1);


    }

    public static void main(String[] args) {
        //below initlises the board with '*'
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '*';


            }
        }

        carpet(size);


        // below replaces a '*' with a ' '
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
