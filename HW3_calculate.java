/**
 * HW3_calculate : В методе calculate реализовать Калькулятор (+,-,*,/)
 * над двумя целыми числами и возвращает результат вещественного типа
 * '3' '+' '7' => 10.0
 */
public class HW3_calculate {

    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        char op = '/';

// Мое Решение:
/** 
  * Double.toString Преобразовывает Int в Double
        System.out.println(Double.toString(calculate(op, a, b)));
*/ 
// Решение Преподавателя:
        System.out.println(calculate(op, a, b)); // т.к метод Сразу возвращает double печатаем без изменений
    }
/** Мое Решение:
 * Метод возвращает тип int и принимает int
    public static int calculate(char op, int a, int b) { 
        int res = 0;
        if (op == '+') {
            res = a + b;
        }
        if (op == '-') {
            res = a - b;
        }
        if (op == '*') {
            res = a * b;
        }
        if (op == '/') {
            res = a / b;
        }
        return res;
    }
*/
// Решение Преподавателя:
// Метод принимает Int и возвращает double
    public static double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double result = 0;
        switch (op) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = minus(a, b);
                break;
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
        }
        return result;
    }

    private static double divide(int a, int b) {
        if (b != 0)
            return (double) a / b; // на Ноль делить нельзя
        return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
