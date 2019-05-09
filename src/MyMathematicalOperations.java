import java.util.Scanner;

public class MyMathematicalOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.contains("+")) {
            adunare(string);
        } else if (string.contains("-")) {
            scadere(string);
        } else if (string.contains("*")) {
            inmultire(string);
        } else if (string.contains("/")) {
            impartire(string);
        } else if (string.contains("%")) {
            rest(string);
        } else {
            System.out.println(" not valid ");
        }

    }

    public static void adunare(String s) {
        String[] str = s.split("\\+");
        int a = Integer.valueOf(str[0].trim());  //sau .parseInt
        int b = Integer.valueOf(str[str.length - 1].trim()); // sau .parseInt
        int result = a + b;
        System.out.println("outpout is: " + result);
    }

    public static void scadere(String s) {
        String[] str = s.split("\\-");
        int a = Integer.valueOf(str[0].trim());
        int b = Integer.valueOf(str[str.length - 1].trim());
        int result = a - b;
        System.out.println("output is: " + result);
    }

    public static void inmultire(String s) {
        String[] str = s.split("\\*");
        int a = Integer.valueOf(str[0].trim());
        int b = Integer.valueOf(str[str.length - 1].trim());
        int result = a * b;
        System.out.println("output is: " + result);
    }

    public static void impartire(String s) {
        String[] str = s.split("\\/");
        int a = Integer.valueOf(str[0].trim());
        int b = Integer.valueOf(str[str.length - 1].trim());
        int result = a / b;
        System.out.println("output is: " + result);
    }

    public static void rest(String s) {
        String[] str = s.split("\\%");
        int a = Integer.valueOf(str[0].trim());
        int b = Integer.valueOf(str[str.length - 1].trim());
        int result = a % b;
        System.out.println("output is: " + result);
    }
}
