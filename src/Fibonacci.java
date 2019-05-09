import java.util.Scanner;

public class Fibonacci {
    private static void WithoutRecursion(int n) {

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);


        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }

    /*private static void Recursion(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);


        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            Recursion(n - 1);
        }


    }*/
    private static int Recursion(int n) {
        if (n < 2) {
            return n;
        } else {
            return Recursion(n - 1) + Recursion(n - 2);

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        WithoutRecursion(m);
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(Recursion(i) + " ");
        }
    }
}


