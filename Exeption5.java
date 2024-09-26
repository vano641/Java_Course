import java.util.Arrays;

/**
 * Exeption5 Реализуйте метод принимающий в качестве аргументов Два целочисленных массива и 
 * возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
 * Если длины массивов Не равны, необходимо как-то оповестить пользователя.
 */
public class Exeption5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5}; //{4,5}
        //int[] result = sumArrays(arr1, arr2);
        //System.out.println(Arrays.toString(result)); // [5,7,9]
// Если длины не равны, то будет выведено на экан Exeption с описанием и ссылками 
// на место в коде где именно ошибка.
        // Для удобства можем ПЕРЕХВАТИТЬ эти сообщения нашим обработчиком исключений:
        try {
            int[] result = sumArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
 
    // метод возвращающий массив из суммы элементов двух массивов
    // обьявим, что наш метод может отбрасывать данные исключения throw new IllegalArgumentException
    public static int[] sumArrays(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
        // если длины массивов не равны бросим исключение (Исключение не подходящего типа)
            throw new IllegalArgumentException("Массивы имеют разную длинну");
        }
        // если длины совпадают, то просуммируем значения
        int[] result = new int[arr1.length]; // результ.массив
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i]; // каждый элемент Результ массива равен сумме двух эл-тов массивов
        }
        return result;
    }
    
}