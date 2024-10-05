/**
 * ExeptionHW8 Нахождение среднеарифметического числа
Напишите метод, который находит среднее значение массива целых чисел.
Если массив пустой или null, метод должен вернуть Double.NaN и вывести
сообщение об ошибке
 */
public class ExeptionHW8 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        double average = ExeptionHW8.findAverage(array);
        System.out.println(average);
    }
    public static double findAverage(int[] array) {
        try {
            if (array == null || array.length == 0) {
                System.out.println("Массив пустой");
                return Double.NaN;
            }
            double sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum / array.length;

        } catch (Exception e) {
// В случае ошибки
            System.out.println("При вычислении произошла ошибка");
            return Double.NaN;
        }
    }
}