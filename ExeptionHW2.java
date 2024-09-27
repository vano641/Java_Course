import java.util.Arrays;

/**
 * ExeptionHW2 Объединение массивов с проверкой длины и содержимого
Реализуйте метод mergeAndValidateArrays, который принимает два массива целых чисел. 
Метод должен объединить массивы и вернуть новый массив. 
    1)Если длины массивов не равны, выбрасывайте исключение IllegalArgumentException. 
    2)Если хотя бы один элемент объединенного массива отрицательный, выбрасывайте исключение 
RuntimeException с сообщением "Обнаружен отрицательный элемент".
 */
public class ExeptionHW2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,-3};
        int[] arr2 = {4,5};
        int[] result = mergeAndValidateArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergeAndValidateArrays(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        for (int i : result) {
            if (i < 0) {
                throw new RuntimeException("Обнаружен отрицательный элемент");
            }
        }
        return result;
    }
}
