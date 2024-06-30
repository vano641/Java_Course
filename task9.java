/**
 * task9: Довется строка S и целочисленный массив индексов int index[s.length].
 * Напишите программу, которая перетасует символы в S таким образом, что символ с 
 * i-й позиции переместится на индекс index[i] в результирующей строке.
 * Пример: s = "cba"; index = [3,2,1]
 *  => "abc"
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.next(); // Вводим и считываем строке в переменную s
        int[] array = new int[s.length()]; // массив индексов (равен размеру строки s)
        for (int i = 0; i < s.length(); i++) {
            logger.info("Введите значение индекса массива");
            array[i] = scanner.nextInt();  // вводим и считываем каждое значение 
        }
        char[] result = new char[s.length()]; // временный массив символов хранящий результирующие значения
        for (int i = 0; i < array.length; i++) {
            char temp = s.charAt(i);// временная переменная для хранения Перемещаемого символа
            int tempIndex = array[i];// Переменная хранящая индекс на который должны переместить символ
            // переместить символ на необходимую позицию(на позицию -1) в результ. массиве
            result [tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result));// конвертирует значения массивов в строковый формат
    }
}
