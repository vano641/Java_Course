import java.util.*;

/**
 * ExeptionHW3 Обработка исключений для разностных массивов
Реализуйте метод subArraysWithExceptionHandling, который принимает
два массива целых чисел. Метод должен возвращать новый массив, где
каждый элемент является разностью соответствующих элементов двух входных
массивов.
    Ошибки записываем в отдельный Список errors
    1)Если длины массивов не равны, выбрасывайте
IllegalArgumentException с сообщением "Массивы разной длины". 
    2)Если результат разности оказывается отрицательным, выбрасывайте
RuntimeException с сообщением "Отрицательный результат разности".
 */
public class ExeptionHW3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {11, 15, 35};
        List<String> errors = new ArrayList<>();
        int[] result = new ExeptionHW3().subArraysWithExceptionHandling(a, b, errors);
        System.out.println(Arrays.toString(result)); // печатаем результат
// проверяем были ли ошибки:
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки: ");
            System.out.println(errors);
        } else {
            System.out.println("Ошибок не обнаружено");
        }

    }
    public static int[] subArraysWithExceptionHandling(int[] a, int[] b, List<String> errors){
        if (a.length != b.length) {
            errors.add("Массивы разной длинны");
            return new int[0]; // Возвращаем пустой массив, т.к длины массивов не совпадают
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
            if (result[i] < 0) {
                errors.add("Отрицательный результат разности в позиции " + i + ": " + result[i]);
            }
        }
        return result;
    }

    
}