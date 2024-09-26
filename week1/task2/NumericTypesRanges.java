public class NumericTypesRanges {
    public static void main(String[] args) {
        // Печать минимального и максимального значений для типа byte
        System.out.println("Тип byte:");
        System.out.println("Минимальное значение: " + Byte.MIN_VALUE); // -128
        System.out.println("Максимальное значение: " + Byte.MAX_VALUE); // 127

        // Byte использует 8 битов, один бит — знак (1 бит на знак и 7 бит на число)
        // = 2^7 = 128 (от -128 до 127)

        // Печать минимального и максимального значений для типа short
        System.out.println("\nТип short:");
        System.out.println("Минимальное значение: " + Short.MIN_VALUE); // -32768
        System.out.println("Максимальное значение: " + Short.MAX_VALUE); // 32767

        // Short использует 16 битов
        // = 2^15 = 32768 (от -32768 до 32767)

        // Печать минимального и максимального значений для типа int
        System.out.println("\nТип int:");
        System.out.println("Минимальное значение: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Максимальное значение: " + Integer.MAX_VALUE); // 2147483647

        // Int использует 32 бита
        // = 2^31 = 2147483648 (от -2147483648 до 2147483647)

        // Печать минимального и максимального значений для типа long
        System.out.println("\nТип long:");
        System.out.println("Минимальное значение: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Максимальное значение: " + Long.MAX_VALUE); // 9223372036854775807

        // Long использует 64 бита
        // = 2^63 = 9223372036854775808 (от -9223372036854775808 до 9223372036854775807)

        // Печать минимального и максимального значений для типа float
        System.out.println("\nТип float:");
        System.out.println("Минимальное значение: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Максимальное значение: " + Float.MAX_VALUE); // 3.4028235E38

        // Float использует 32 бита (по стандарту IEEE 754)
        // Индикатор, степень, и 23 бита для мантиссы. Минимальное положительное значение очень маленькое.

        // Печать минимального и максимального значений для типа double
        System.out.println("\nТип double:");
        System.out.println("Минимальное значение: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Максимальное значение: " + Double.MAX_VALUE); // 1.7976931348623157E308

        // Double использует 64 бита (по стандарту IEEE 754)
        // Индикатор, степень, и 52 бита для мантиссы. Минимальное положительное значение крайне мало.
    }
}