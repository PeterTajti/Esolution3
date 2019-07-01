public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row] == matrix[column]) {
                    System.out.print(1);
                } else
                    System.out.print(0);


            }
            System.out.println();


        }


    }

}



