import java.util.Scanner;

public class DodecahedronVolumeCalculator {
    
    // Метод для вычисления объема додекаэдра
    public static double calculateVolume(double edgeLength) {
        return (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра додекаэдра: ");
        // Проверяем, является ли введенное значение числом
        if (scanner.hasNextDouble()) {
            double edgeLength = scanner.nextDouble();

            // Проверяем, чтобы длина ребра была положительной
            if (edgeLength <= 0) {
                System.out.println("Длина ребра должна быть положительной.");
            } else {
                double volume = calculateVolume(edgeLength);
                System.out.printf("Объем додекаэдра с длиной ребра %.2f равен %.2f.%n", edgeLength, volume);
            }
        } else {
            System.out.println("Ошибка: введено нечисловое значение.");
        }

        scanner.close();
    }
}