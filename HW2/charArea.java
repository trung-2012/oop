package OOP.HW2;

public class charArea {
    private char[][] grid;

    public charArea(char[][] grid) {
        this.grid = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            this.grid[i] = grid[i].clone();
        }
    }

    public int numRows() {
        return grid.length;
    }

    public int numCols() {
        return grid[0].length;
    }

    public int charArea(char ch) {
        int minRow = numRows();
        int maxRow = -1;
        int minCol = numCols();
        int maxCol = -1;

        for (int r = 0; r < numRows(); r++) {
            for (int c = 0; c < numCols(); c++) {
                if (grid[r][c] == ch) {
                    if (r < minRow) minRow = r;
                    if (r > maxRow) maxRow = r;
                    if (c < minCol) minCol = c;
                    if (c > maxCol) maxCol = c;
                }
            }
        }

        if (maxRow == -1) {
            return 0;
        }

        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}

