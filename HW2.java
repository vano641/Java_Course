/**
 * HW2: Напишите функцию printPrimeNums, которая выведет на экран все
 * простые числа в промежутке от 1 до 1000, каждое на новой строке
 * 2
 * 3
 * 5
 * 7
 * 11
 * и.т.д...
 */
public class HW2 {

    public static void main(String[] args) {

// Мое Решение:
/** 
        int n = 1000;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }      
            }
            if (count > 2) {
                count = 0;
            } else{
                System.out.println(i);
                count = 0;
            }
        }
*/
// Решение Преподавателя:

     // Проход начинается с 2, т.к. это число является наименьшим простым
     for (int i = 2; i <= 1000; i++) {
         boolean isPrime = true;
         // Проверка, является ли число i простым
         // Проход по циклу до корня числа,
         // т.к. дальше нет смысла искать, делителей нет.
         for (int j = 2; j <= Math.sqrt(i); j++) {
             if (i % j == 0) {
                 isPrime = false;
                 break;
             }
         }
         // Если число i простое, вывод его на экран
         if (isPrime)
             System.out.println(i);
    }
}
}

