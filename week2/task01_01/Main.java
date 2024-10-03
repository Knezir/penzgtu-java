// Определение класса
class Person {
    // Атрибуты
    private String name;
    private int age;

    // Переопределение конструктора по умолчанию
    public Person() {
        this.name = "Неизвестно";
        this.age = 0;
    }

    // Конструктор с параметрами
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Проверка на отрицательные значения
            this.age = age;
        }
    }

    // Метод для вывода данных класса
    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}

// Главный класс для создания экземпляров и вывода данных
public class Main {
    public static void main(String[] args) {
        // Создание нескольких экземпляров класса
        Person person1 = new Person("Алекс", 19);
        Person person2 = new Person("Нестор", 22);
        Person person3 = new Person(); // Использует конструктор по умолчанию

        // Вывод данных на экран
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
