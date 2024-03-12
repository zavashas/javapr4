import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите фигуру для подсчета:\n1. Квадрат\n2. Прямоугольник\n3. Круг");
            int choice = scanner.nextInt();
            Figure figure;
            switch (choice) {
                case 1:
                    System.out.println("Введите длину стороны квадрата:");
                    double side = checkNegative(scanner);
                    figure = new Square(side);
                    break;
                case 2:
                    System.out.println("Введите длину и ширину прямоугольника:");
                    double a = checkNegative(scanner);
                    double b = checkNegative(scanner);
                    figure = new Rectangle(a, b);
                    break;
                case 3:
                    System.out.println("Введите радиус круга:");
                    double radius = checkNegative(scanner);
                    figure = new Circle(radius);
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    continue;
            }
            System.out.println("Площадь: " + figure.S());
            System.out.println("Периметр: " + figure.P());
        }
    }
    private static double checkNegative(Scanner scanner) {
        double input;
        do {
            input = scanner.nextDouble();
            if (input <= 0) {
                System.out.println("Введите положительное число:");
            }
        } while (input <= 0);
        return input;
    }
}


