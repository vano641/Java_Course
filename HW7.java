import java.util.ArrayList;
import java.util.Arrays;

/**
 * HW7: Дан произвольный массив целых чисел Integer[] arr. 
 * Создайте список ArrayList, заполненный данными из этого массива.
 * Необходимо удалить из списка четные числа и вернуть результирующий список ArrayList<Integer>.
 * 1, 2, 3, 4, 5, 6, 7, 8, 9 => [1, 3, 5, 7, 9]
 * 2, 4, 6, 8 => []
 */
public class HW7 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};// Исходный массив
        ArrayList<Integer> list = removeEvenNumbers(array); // Результирующий список МОЙ
        ArrayList<Integer> list2 = removeEvenNumbers2(array); // Преподавателя
        System.out.println(list);
        System.out.println(list2);
        }
// МОЕ РЕШЕНИЕ:

// Метод удаляющий Четные значения:
// На вход подаем Массив Integer, на выход Список ArrayList<Integer>
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                list.add(arr[i]); // Добавляем Не Четные элементы в Результирущий список 
            }
        }
        return list; 
    }
// РЕШЕНИЕ ПРЕПОДАВАТЕЛЯ:

    public static ArrayList<Integer> removeEvenNumbers2(Integer[] arr) {
      ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr)); // Преобразуем Массив в Список
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) { // если элемент с позицией i Четный
                nums.remove(i); // то удаляем его по позиции
                i--; // уменьшилась и длинна nums
            }
        }
        return nums;
    }
}

