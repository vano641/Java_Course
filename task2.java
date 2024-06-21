/**
 * task2: В консоли запросить имя пользователя.
 * В зависимости от времени, вывести приветствие вида:
 * "Доброе утро, <Имя>", если время от 05:00 до 11:59
 * "Добрый день, <Имя>", если время от 12:00 до 17:59
 * "Добрый вечер, <Имя>", если время от 18:00 до 22:59
 * "Доброй ночи, <Имя>", если время от 23:00 до 04:59
 */
import java.time.LocalDateTime;
import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // сохраняем введенное имя в переменную S
// переменная для получения текущего времени
        LocalDateTime dateTime = LocalDateTime.now();
        int i = dateTime.getHour(); // Переменная для получения текущего часа
// проверка переменной i 
        String temp = "";
// в зависимости от Текущего времени будет выведена разное сообщение
        if(i >= 5 && i < 12) {
            temp = "Доброе утро";
        }
        if(i >= 12 && i < 18) {
            temp = "Добрый день";
        }
        if(i >= 18 && i < 23) {
            temp = "Добрый вечер";
        }
        if(i < 5 || i == 23) {
            temp = "Доброй ночи";
        }
        System.out.println(temp + "," + s + ", сейчас: " + i + " часов");

        
    }
}
