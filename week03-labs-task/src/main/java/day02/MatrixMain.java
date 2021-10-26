package day02;

public class MatrixMain {

    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        int[][] upperTriangularMatrix = {{1, 2, 3, 4, 5}, {0, 2, 3, 4, 5}, {0, 0, 3, 4, 5}, {0, 0, 0, 4, 5}, {0, 0, 0, 0, 5}};
        int[][] regularMatrix = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        System.out.println(matrix.isUpperTriangularMatrix(upperTriangularMatrix));
        System.out.println(matrix.isUpperTriangularMatrix(regularMatrix));
    }
}
