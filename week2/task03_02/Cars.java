import java.util.ArrayList;
import java.util.List;

// Класс Engine
class Engine {
    private int power; // Мощность двигателя

    // Конструктор
    public Engine(int power) {
        this.power = power;
    }

    // Метод получения мощности двигателя
    public int getPower() {
        return power;
    }
}

// Класс Passenger
class Passenger {
    private String name; // Имя пассажира

    // Конструктор
    public Passenger(String name) {
        this.name = name;
    }

    // Метод получения имени пассажира
    public String getName() {
        return name;
    }
}

// Класс Car
class Car {
    private String model; // Модель автомобиля
    private Engine engine; // Двигатель автомобиля
    private List<Passenger> passengers; // Список пассажиров

    // Конструктор
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.passengers = new ArrayList<>();
    }

    // Метод для добавления пассажира
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < 2) { // Ограничим количество пассажиров до 2
            passengers.add(passenger);
            System.out.println(passenger.getName() + " добавлен в автомобиль " + model);
        } else {
            System.out.println("Невозможно добавить пассажира: максимальное количество пассажиров достигнуто.");
        }
    }

    // Метод для удаления пассажира
    public void removePassenger(Passenger passenger) {
        if (passengers.remove(passenger)) {
            System.out.println(passenger.getName() + " удален из автомобиля " + model);
        } else {
            System.out.println(passenger.getName() + " не найден в автомобиле " + model);
        }
    }

    // Метод для отображения информации об автомобиле
    public void displayInfo() {
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Мощность двигателя: " + engine.getPower() + " л.с.");
        System.out.println("Пассажиры: ");
        for (Passenger p : passengers) {
            System.out.println("- " + p.getName());
        }
        if (passengers.isEmpty()) {
            System.out.println("Нет пассажиров.");
        }
    }
}

// Основной класс для демонстрации работы программы
public class Cars {
    public static void main(String[] args) {
        // Создание двигателя
        Engine engine = new Engine(112);

        // Создание автомобиля
        Car car = new Car("Toyota ae86", engine);

        // Создание пассажиров
        Passenger passenger1 = new Passenger("Иван");
        Passenger passenger2 = new Passenger("Никита");
        Passenger passenger3 = new Passenger("Нестор");

        // Добавление пассажиров
        car.addPassenger(passenger1);
        car.addPassenger(passenger2);
        car.addPassenger(passenger3); // Эта попытка добавления должна быть отклонена

        // Отображение информации об автомобиле
        car.displayInfo();

        // Удаление пассажира
        car.removePassenger(passenger1);
        car.displayInfo(); // Проверка после удаления
    }
}
