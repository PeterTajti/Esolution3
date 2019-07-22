package SymmetricMatrix;

public class SymmetricMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5},
        };

        int[][] matrix2 = {
                {1, 4, 1},
                {0, 2, 2},
                {1, 2, 5},
        };

        System.out.println(isSymmetric(matrix1));
        System.out.println(isSymmetric(matrix2));
    }

    public static boolean isSymmetric(int[][] matrix){
        Boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == matrix[j][i]){
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            break;
        }
        return result;
    }
}