/**
 * HW1: Вычислить n-ое Треугольное число (сумма чисел от 1 до n)
 * Если число n < 1 (ненатуральное) метод должен вернуть -1
 * n = 4 => 10
 * n = 5 => 15
 */
public class HW1 {

    public static void main(String[] args) {
        int n = 5;
        int result = countNTriangle(n); // Передаем в метод число n
        System.out.println(result); // Печатаем возвращенный ответ
    }

    public static int countNTriangle(int n) { // Метод принимающий n и вычисляющий Треугольное число
        int res = 0;
        if (n < 1) {
            res = -1;
            return res;
        } else{
            for (int i = 0; i <= n; i++) {
                res += i;
            }
            return res;
        }
  
    }
}