package Collections_Framework_Package;

import java.util.*;

class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
//          Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 50) + 1 + "");
        }

        Iterator it = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    } // main
}
/*
 22 46 48 26 27
 50 30 31 11 12
 34 35 14 38 17
 19  2  3  4  7
  8  9 41 20 42
 */