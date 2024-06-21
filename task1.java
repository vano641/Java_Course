/**
 * task1: Написать< программу которая:
 * Запрашивает ввести Имя пользователя в консоли
 * Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>"
 */
import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        // Мое Решение:
       /** Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите Имя пользователя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();
        */

        // Решение Преподавателя:
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String("Привет, %s");
        System.out.printf(out,s);
    }
    
}