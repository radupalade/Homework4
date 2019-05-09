import java.util.Scanner;

public class TriangularPattern {
    private static void triangles(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("#" + " ");//sau sout (i) pt NumberPattern(nested-loop)

    }

    private static void spaces(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" " + " ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            triangles(i + 1);
            spaces(m - i - 1);
            System.out.print(" " + " ");
            triangles(m - i);
            System.out.print(" ");
            spaces(2 * i);
            System.out.print(" ");
            triangles(m - i);
            System.out.print(" " + " ");
            spaces(m - i - 1);
            triangles(i + 1);

            System.out.println();
        }
    }
}
