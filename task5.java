/**
 * task5: Реализовать функцию возведения числа "а" в степень "b"
 * где а и b натуральные числа
 * а = 3; b = 2 => 9
 * a = 2; b = -2 => 0.25
 * a = 3; b = 0 => 1
 */
import java.util.Scanner;
public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

// Решение 1: Через циклы
        /**
        int result = 1;
        for (int i = 1; i <= b; i++) { // сколько b столько раз перемножить а
            result = result * a;     
        }
        System.out.print(result);
        */

/** Решение 2: вызов метода pow из main
        int c = pow(a, b);
        System.out.print(c);
*/
// Решение 3: Через встроенную библиотеку Math ОПТИМАЛЬНЫЙ МЕТОД
        double c = Math.pow(a, b);
        System.out.print(c);
    }

/**  Решение 2: через Рекурсию НЕ РЕКОМЕНДОВАННО ИСПОЛЬЗОВАТЬ БОЛЬШАЯ ВЕРОЯТНОСТЬ ОШИБКИ
    public static int pow(int a, int b) {
        if(b == 1) {
            return a;
        } else {
            return a * pow(a, b - 1);
        }
    }
*/
        
}