package day02;

public class Matrix {

    public boolean isUpperTriangularMatrix(int[][] matrix) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
