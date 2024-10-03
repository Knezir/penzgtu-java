public class BankAccount {
    // Поля
    private String accountNumber;  // Номер счета
    private double balance;         // Баланс

    // Конструктор
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Инициализируем баланс нулем
    }

    // Метод для внесения суммы на счет
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Сумма внесения должна быть положительной.");
        }
    }

    // Метод для снятия суммы со счета
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + ". Остаток на счете: " + balance);
        } else if (amount > balance) {
            System.out.println("Недостаточно средств для снятия этой суммы.");
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для получения номера счета
    public String getAccountNumber() {
        return accountNumber;
    }

    // Основной метод для тестирования класса
    public static void main(String[] args) {
        // Создание экземпляра BankAccount
        BankAccount account = new BankAccount("1234567890");

        // Тестирование методов
        account.deposit(2000);
        account.withdraw(700);
        account.withdraw(1500); // Попытка снять больше, чем на счету
        account.deposit(-200); // Попытка внести отрицательную сумму
        account.withdraw(300);
        
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
