// Last updated: 09/02/2026, 13:34:09
import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {           // row
            for (int j = 0; j < 9; j++) {       // column
                char number = board[i][j];

                if (number != '.') {
                    // Create unique identifiers for row, column and box
                    String rowKey = number + " in row " + i;
                    String colKey = number + " in col " + j;
                    String boxKey = number + " in box " + (i/3) + "-" + (j/3);

                    // If any identifier is already seen, it's invalid
                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
