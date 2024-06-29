/**
 * task8: Посчитайте сколько "Драгоценных камней" в куче "Обычных"
 * Пример: jewels = "aB", stones = "aaaAbbbB"
 * Результат: "a3B1"
 */
import java.util.Scanner;
import java.util.logging.Logger;
public class task8 {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите значения драгоценностей");
        String jawels = scanner.next();
        logger.info("Введите строку Обычных камней");
        String stones = scanner.next();
        if (jawels.length() == 0) {
            throw new Exception("Не введен не один символ Драгоценностей");
        }
        if (stones.length() == 0) {
            throw new Exception("Не введен не один символ Обычных Камней");
        }
// Разбить строку jawels на массив символов.
// пройтись по каждому символу jawels и искать его в строке stones
        int counter = 0; // счетчик Драгоценностей
        StringBuilder sb = new StringBuilder();
        for(char c1: jawels.toCharArray()){
            for(char c2: stones.toCharArray()){ // каждое значение jawels сравниваем
// с множеством значений stones
                if(c1 == c2){
                    counter++;
                }
            }
// после прохлда по строке stones добавляем в StringBuilder символ с1 (и форматируем)
            sb.append(c1)
                    .append(":")
                    .append(counter)
                    .append(" ");
            counter = 0;
        }
        logger.info(sb.toString());

    }
}