/**
 * task7: Написать метод, который сжимает строку.
 * Пример: вход aaaabbbcdd
 */
import java.util.Scanner;
import java.util.logging.Logger;
public class task7 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);// объявляем сканер
        Logger logger = Logger.getLogger("Main");// объявляем логгер
        logger.info("Введите исходную строку"); // Просим пользователя
        String s = scanner.next(); // сканируем ввод
// проверяем корректность ввода (строка пустая?)
// не имеет смысла запускать алгоритм если Ввод не Корректный
        if (s.length() == 0) {
            throw new Exception("Введена пустая строка"); // указываем в main сверху
        }
// Разбиение строки на массив символов входящих в нее.
        char c; // врем. переменная которая хранит текущий символ из строки
        StringBuilder sb = new StringBuilder();// Перечень уникальных символов
        c = s.charAt(0); // присваиваем "c" значение самого первого символа в строке "s"
        sb.append(c); // добавляем этот символ в Стринг Билдер
        for (char item : s.toCharArray()) { // Перебираем каждый элемент foreach
// char item (перебераем символы), возьми строку s и разбей на массив символов входящих в нее.
// далее сравниваем символ "c" c item, если они не совпадают, то добавляем item в СтрингБилдер
            if(c != item) {
                sb.append(item);
            }
            c = item; // после сравнения меняем значение "c"
        }
        logger.info(sb.toString()); // выводим результат в консоль
// Логер принимает в любой метод тип Стринг (а у нас до этого быс СтрингБилдер) 
// toString собирает все значения sb в строчку
    }
}