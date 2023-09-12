import java.awt.List;

import java.util.Scanner;

public class morpion {

    // tableau 2d
    static void displayGrid(int[][] grid2d){
        for (int row = 0; row < grid2d.length; row++){
            for (int col= 0; col < grid2d[row].length; col++){
                System.out.print( " | " );
                int value = grid2d[row][col];
                System.out.print( (char)value );
            }
            System.out.println( " | ");
        }
    }
    public static void main(String[] args) {

        int[][] grid2d = new int[3][3];
        boolean isFinished = false;

        while (!isFinished){
            Scanner sc = new Scanner(System.in);
            System.out.println("1: entrer un nombre entre 1 et 9:");
            int number = sc.nextInt();

            placementPiece(grid2d, number, "player1");
            displayGrid(grid2d);


            System.out.println("2: entrer un nombre entre 1 et 9:");
            number = sc.nextInt();
            placementPiece(grid2d, number, "player2");


            displayGrid(grid2d);
        }
        }
        public static void placementPiece(int[][] grid2d, int number, String user ){

            char symbol = ' ';
            System.out.println(number);
            List<Integer> stockNumber = new ArrayList<Integer>();

            if (user.equals("player1")){
                if (number > 9 || number < 1){
                    System.out.println("Non entre 1 et 9");
                }
                symbol = 'X';
            } else if (user.equals("player2")) {
                if (number > 9 || number < 1){
                    System.out.println("Non entre 1 et 9");
                }
                symbol = 'O';
            }

            if (number == 1){
                grid2d[0][0] = symbol;
            } else if (number == 2) {
                grid2d[0][1] = symbol;
            }else if (number == 3) {
                grid2d[0][2] = symbol;
            }else if (number == 4) {
                grid2d[1][0] = symbol;
            }else if (number == 5) {
                grid2d[1][1] = symbol;
            }else if (number == 6) {
                grid2d[1][2] = symbol;
            }else if (number == 7) {
                grid2d[2][0] = symbol;
            }else if (number == 8) {
                grid2d[2][1] = symbol;
            }else if (number == 9) {
                grid2d[2][2] = symbol;
            }


        }
    }


