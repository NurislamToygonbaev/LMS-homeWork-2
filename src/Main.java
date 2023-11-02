import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle();
        System.out.print("длина А: ");
        triangle.a = scanner.nextInt();
        System.out.print("длина Б: ");
        triangle.b = scanner.nextInt();
        System.out.print("длина C: ");
        triangle.c = scanner.nextInt();

        triangle.area();
    }
}