// Класс Author
class Author {
    private String name;       // Имя автора
    private int birthYear;     // Год рождения автора

    // Конструктор
    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Метод для получения имени автора
    public String getName() {
        return name;
    }

    // Метод для установки имени автора
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения года рождения автора
    public int getBirthYear() {
        return birthYear;
    }

    // Метод для установки года рождения автора
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}

// Класс Book
class Book {
    private String title;       // Название книги
    private Author author;      // Автор книги

    // Конструктор
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для установки названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Метод для получения информации об авторе книги
    public Author getAuthor() {
        return author;
    }

    // Метод для установки автора книги
    public void setAuthor(Author author) {
        this.author = author;
    }
}

// Основной класс для тестирования
public class Task {
    public static void main(String[] args) {
        // Создание объекта Author
        Author author = new Author("Александр Пушкин", 1799);

        // Создание объекта Book
        Book book = new Book("Евгений Онегин", author);

        // Вывод информации об авторе книги
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor().getName());
        System.out.println("Год рождения автора: " + book.getAuthor().getBirthYear());
    }
}
