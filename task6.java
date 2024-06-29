import java.util.Scanner;

/**
 * task6: Дано четное число N(>0) и символы с1 и с2.
 * Написать метод, который вернет строку длинны N,
 * которая состоит из чередующихся символов с1 и с2, начиная с с1
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class task6 {

    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in); // обьявляем сканер
        Logger logger = Logger.getLogger("Main"); // для взаимодействия с логированием
// Временные переменные для введенных данных с клавиатуры
        String c1;
        String c2;
        int n;
// Просим пользователя ввести те или иные значения
        logger.info("Введите значение c1: ");
        c1 = scanner.next();
        logger.info("Введите значение c2: ");
        c2 = scanner.next();
        logger.info("Введите значение N: ");
        n = scanner.nextInt();
// Проверка входных значений на условие задачи N > 0.
// бросаем исключение если условие не соответствует
        if (n <= 0) {
            throw new Exception("Не валидное значение N"); // чтобы не было ошибки в методе main
// необходимо указывать, что будут исключения (public static void main(String[] args)  throws Exception)
        }
// если i четное, то выводим с1 если нет, то с2
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0){
                System.out.print(c1);
            }
            if (i % 2 == 1) {
                System.out.print(c2);
            }
        }
    }
}
