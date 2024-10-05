import java.util.Arrays;

/**
 * ExeptionHW7 Сортировка массива строк
Напишите метод, который принимает массив строк и сортирует его в
алфавитном порядке. Если входной массив null, метод должен вернуть пустой
массив и вывести сообщение об ошибке.
 */
public class ExeptionHW7 {

    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "cherry",};
        String[] result = ExeptionHW7.sortStrings(strings);
        System.out.println(Arrays.toString(result));
    }
    public static String[] sortStrings(String[] strings) {
        try {
            if (strings == null) {
                System.out.println("Введен пустой массив");
                return new String[0];
            }
// Метод Arrays.sort() для сортировки массива строк. Этот метод
// автоматически упорядочивает строки в алфавитном порядке
            Arrays.sort(strings);
            return strings;

        } catch (Exception e) {
// В случае ошибки сокртировки (Если введены неподходящие Типы данных)
            System.out.println("Ошибка при сортировки");
            return new String[0];
        }
    }
}