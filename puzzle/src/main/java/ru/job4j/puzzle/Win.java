package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && checkHorizontal(board, i)
                    || checkVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] array, int row) {
        boolean res = true;
        for (int cell = 0; cell < array[row].length; cell++) {
            if (array[row][cell] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean checkVertical(int[][] array, int column) {
        boolean res = true;
        for (int row = 0; row < array.length; row++) {
            if (array[row][column] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }
}
