import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * HW8:Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число}
- Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is {число}
4, 2, 7, 5, 1, 3, 8, 6, 9 =>[1, 2, 3, 4, 5, 6, 7, 8, 9]
                            Minimum is 1
                            Maximum is 9
                            Average is 5.0
 */
public class HW8 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list); // сортируем список
        double sum = 0; // находим сумму элементов
        for (Integer i : list) { sum += i;    
        }
        System.out.println(list);// выводим отсортированный список
        System.out.println("Minimum is " + list.get(0)); // выводим Мин. Элемент
        System.out.println("Maximum is " + list.get(list.size() - 1)); // Выводим Макс.Элемент
        System.out.println("Average is " + sum/list.size()); // Выводим Ср.Арифметическое
    }
}