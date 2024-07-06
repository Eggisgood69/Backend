class MatrixMultiplicationTask implements Runnable {
    private int[][] result;
    private int[][] matrixA;
    private int[][] matrixB;
    private int row;

    public MatrixMultiplicationTask(int[][] result, int[][] matrixA, int[][] matrixB, int row) {
        this.result = result;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.row = row;
    }

    @Override
    public void run() {
        for (int j = 0; j < matrixB[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < matrixA[0].length; k++) {
                result[row][j] += matrixA[row][k] * matrixB[k][j];
            }
        }
    }
}

public class ParallelMatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[matrixA.length][matrixB[0].length];

        Thread[] threads = new Thread[matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            threads[i] = new Thread(new MatrixMultiplicationTask(result, matrixA, matrixB, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}							 