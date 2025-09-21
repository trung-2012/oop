package OOP.HW1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.PURPLE);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int direction = 0;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.filledSquare(x, y, 0.45);
            if (direction == 0){
                if (x == -y-1) {
                    direction = 1;
                    continue;
                }
                x--;
            } else if (direction == 1) {
                if (y == x) {
                    direction = 2;
                    continue;
                }
                y--;
            } else if (direction == 2) {
                if (x == -y) {
                    direction = 3;
                    continue;
                }
                x++;
            } else if (direction == 3) {
                if (y == x) {
                    direction = 0;
                    continue;
                }
                y++;
            }
            steps++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(300);
        }
        StdOut.println("Total steps = " + steps);
    }

}