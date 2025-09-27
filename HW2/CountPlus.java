package OOP.HW2;

public class CountPlus {
    private char[][] grid;

    public CountPlus(char[][] grid) {
        this.grid = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            this.grid[i] = grid[i].clone();
        }
    }

    public int  numRows() {
        return grid.length;
    }
    public int  numCols() {
        return grid[0].length;
    }

    private int countDirection(int r, int c, int dr, int dc){
        char ch = grid[r][c];
        int count = 0;
        int row = r + dr;
        int col = c + dc;

        while(row >= 0 && row < numRows() && col >= 0 && col < numCols() && grid[row][col] == ch ){
            count ++;
            row += dr;
            col += dc;
        }
        return count;
    }
    public int countPlus(){
        int count = 0;
        for (int i = 0; i < numRows(); i++) {
            for (int j = 0; j < numCols(); j++) {
                char ch = grid[i][j];

                int up = countDirection(i, j, -1, 0);
                int down = countDirection(i, j, 1, 0);
                int left = countDirection(i, j, 0, -1);
                int right = countDirection(i, j, 0, 1);

                int minArm = Math.min(Math.min(up, down), Math.min(left, right));

                if (minArm >= 2) {
                    count++;
                }
            }
        }
        return count;
    }

}
