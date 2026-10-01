class MatrixQ26 {
    int[][] matrix1 = {{1, 2}, {3, 4}};
    int[][] matrix2 = {{5, 6}, {7, 8}};

    static String matrixType = "2x2 Matrix";

    void calculate() {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            System.out.println(sum[i][0] + " " + sum[i][1]);
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            System.out.println(difference[i][0] + " " + difference[i][1]);
        }
    }

    public static void main(String[] args) {
        MatrixQ26 m = new MatrixQ26();
        m.calculate();
    }
}
