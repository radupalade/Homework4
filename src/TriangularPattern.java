import java.util.Scanner;

public class TriangularPattern {
    private static void triangles(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("*");

    }

    private static void spaces(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            triangles(i + 1);
            spaces(m - i - 1);
            triangles(m - i + 1);
            spaces(2 * i);
            triangles(m - i + 1);
            spaces(m - i - 1);
            triangles(i + 1);

            System.out.println();
        }
    }
}
