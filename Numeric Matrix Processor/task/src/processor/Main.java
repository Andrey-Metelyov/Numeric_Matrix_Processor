package processor;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.print("1. Add matrices\n" +
                    "2. Multiply matrix to a constant\n" +
                    "3. Multiply matrices\n" +
                    "4. Transpose matrix\n" +
                    "5. Calculate a determinant\n" +
                    "6. Inverse matrix\n" +
                    "0. Exit\n" +
                    "Your choice: ");
            String id = scanner.nextLine();
            switch (id) {
                case "1":
                    add();
                    break;
                case "2":
                    mulnum();
                    break;
                case "3":
                    mulmat();
                    break;
                case "4":
                    transpose();
                    break;
                case "5":
                    det();
                    break;
                case "6":
                    inverse();
                    break;
                case "0":
                    return;
            }
        }
    }

    private static void inverse() {
        Matrix a = Matrix.getMatrix(scanner);
        System.out.println("The inverse matrix is:\n" + a.inv().toStringDouble());
    }

    private static void det() {
        Matrix a = Matrix.getMatrix(scanner);
        System.out.println("The determinant is:\n" + a.det());
    }

    private static void transpose() {
        System.out.println("1. Main diagonal\n" +
                "2. Side diagonal\n" +
                "3. Vertical line\n" +
                "4. Horizontal line\n" +
                "Your choice: ");
        String id = scanner.nextLine();
        Matrix m = Matrix.getMatrix(scanner);
        switch (id) {
            case "1":
                System.out.println(m.transpose());
                break;
            case "2":
                System.out.println(m.transposeSide());
                break;
            case "3":
                System.out.println(m.transposeVertical());
                break;
            case "4":
                System.out.println(m.transposeHorizontal());
                break;
        }
    }

    private static void mulmat() {
        Matrix a = Matrix.getMatrix(scanner);
        Matrix b = Matrix.getMatrix(scanner);
        System.out.println("The multiplication result is:\n" + a.multiply(b).toStringDouble());
    }

    private static void mulnum() {
        Matrix a = Matrix.getMatrix(scanner);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("The multiplication result is:\n" + a.multiply(number));
    }

    private static void add() {
        Matrix a = Matrix.getMatrix(scanner);
        Matrix b = Matrix.getMatrix(scanner);
        System.out.println("The addition result is:\n" + a.add(b).toStringDouble());
    }

}
