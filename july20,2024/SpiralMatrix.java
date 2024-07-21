import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // pointers to traverse the matrix
        int row = 0;
        int col = -1;

        // if direction == 1 move left to right or top to bottom, if -1 move right to left or bottom to top
        int direction = 1;

        ArrayList<Integer> result = new ArrayList<>();

        while(rows > 0 && cols > 0) {
            for(int i = 0; i < cols; i++) {
                col += direction;
                result.add(matrix[row][col]);
            }
            rows--;

            for(int i = 0; i < rows; i++) {
                row += direction;
                result.add(matrix[row][col]);
            }
            cols--;

            direction *= -1;
        }

        return result;
        
    }
}
