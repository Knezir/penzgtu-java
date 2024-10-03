public class Octagon {
    // Атрибут
    private double innerRadius;

    // Конструктор
    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    // Метод для установки значения innerRadius
    public void setInnerRadius(double innerRadius) {
        if (innerRadius > 0) { // Проверка на положительное значение
            this.innerRadius = innerRadius;
        } else {
            throw new IllegalArgumentException("Радиус должен быть положительным числом.");
        }
    }

    // Геттер для innerRadius
    public double getInnerRadius() {
        return innerRadius;
    }

    // Метод для расчета площади восьмиугольника
    public double calculateArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(innerRadius, 2);
    }

    // Метод для расчета периметра восьмиугольника
    public double calculatePerimeter() {
        return 8 * (innerRadius * Math.sqrt(2)); // Нужен внешний радиус для точного периметра
    }

    // Основной метод для тестирования класса
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5.0); // Создаем экземпляр класса

        System.out.println("Inner Radius: " + octagon.getInnerRadius());
        System.out.println("Area: " + octagon.calculateArea());
        System.out.println("Perimeter: " + octagon.calculatePerimeter());
    }
}
