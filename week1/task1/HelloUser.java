import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем имя пользователя
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();
        
        // Выводим приветственное сообщение
        System.out.println("Привет, " + userName + "!");
        
        // Закрываем сканер
        scanner.close();
    }
}