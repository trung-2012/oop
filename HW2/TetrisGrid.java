package OOP.HW2;

public class TetrisGrid {
    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        this.grid = new boolean[grid.length][];
        for (int x = 0; x < grid.length; x++) {
            this.grid[x] = grid[x].clone();
        }
    }

    public int getWidth() {
        return grid.length;
    }

    public int getHeight() {
        return grid[0].length;
    }

    public boolean[][] getGrid() {
        boolean[][] copy = new boolean[getWidth()][getHeight()];
        for (int x = 0; x < getWidth(); x++) {
            copy[x] = grid[x].clone();
        }
        return copy;
    }

    public void clearRows() {
        int toY = 0;
        for (int y = 0; y < getHeight(); y++) {
            if (!isRowFull(y)) { // nếu hàng chưa đầy -> copy xuống
                for (int x = 0; x < getWidth(); x++) {
                    grid[x][toY] = grid[x][y];
                }
                toY++;
            }
        }

        for (int y = toY; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                grid[x][y] = false;
            }
        }
    }

    private boolean isRowFull(int y) {
        for (int x = 0; x < getWidth(); x++) {
            if (!grid[x][y]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = getHeight() - 1; y >= 0; y--) { // từ trên xuống
            for (int x = 0; x < getWidth(); x++) {
                sb.append(grid[x][y] ? "X " : ". ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[][]{
                {true,  true,  true,  false},  // cột 0
                {true,  true,  true,  true},   // cột 1
                {true,  true,  true,  false}   // cột 2
        };

        TetrisGrid tg = new TetrisGrid(grid);
        System.out.println("Bảng trước khi clear:");
        System.out.println(tg);

        tg.clearRows();
        System.out.println("Bảng sau khi clear:");
        System.out.println(tg);
    }
}
