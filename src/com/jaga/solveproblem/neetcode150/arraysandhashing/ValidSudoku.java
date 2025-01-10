package com.jaga.solveproblem.neetcode150.arraysandhashing;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {

      char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        boolean validSudoku = isValidSudoku(board);
        System.out.println(validSudoku);
    }

    public static boolean isValidSudoku(char[][] board) {

        //initialize hash set

        //HashSet<Character>[] row = new HashSet<>[9];
        // you can create generic array like above
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if(board[i][j]=='.') {
                    continue;
                }

                int boxesIndex = i/3*3+j/3;

                if(row[i].contains(board[i][j]) || column[j].contains(board[i][j]) || boxes[boxesIndex].contains(board[i][j])) {
                    return false;
                }

                row[i].add(board[i][j]);
                column[j].add(board[i][j]);
                boxes[boxesIndex].add(board[i][j]);
            }
            
        }

        return true;

    }


}
