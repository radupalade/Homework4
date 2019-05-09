public class ShowMatrixMirrors {

    public static void readMatrix(int a[][]) {
        int x = 10;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = x;
                x = x + 4;
            }
        }
    }

    public static void printMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "| ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] mirrorVertically(int[][] m) {
        int[][] mirrorImage = new int[4][4];
        int imageRows = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = 0; j < m.length; j++) {
                mirrorImage[imageRows][j] = m[i][j];
            }
            imageRows++;
        }

        return mirrorImage;
    }

    public static int[][] mirrorOrizontaly(int[][] a) {
        int[][] x = new int[4][4];
        int k;
        for (int i = 0; i < a.length; i++) {
            k = 0;
            for (int j = a.length - 1; j >= 0; j--) {
                x[i][k] = a[i][j];
                k++;
            }
        }
        return x;
    }

    public static int[][] mirrorBothWays(int[][] a) {
        int[][] mirrorImage = new int[4][4];
        int imageRows = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int imageColumn = 0;
            for (int j = a.length - 1; j >= 0; j--) {
                mirrorImage[imageRows][imageColumn] = a[i][j];
                imageColumn++;
            }
            imageRows++;
        }
        return mirrorImage;
    }

    public static void main(String[] args) {
        int[][] a = new int[4][4];

        readMatrix(a);
        printMatrix(a);
        printMatrix(mirrorVertically(a));
        printMatrix(mirrorOrizontaly(a));
        printMatrix(mirrorBothWays(a));
    }

}
