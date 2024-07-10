import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * task11 Заполнить список 10ю случайными числами.
 * Отсортировать список мотодом sort() и вывести на экран
 */
public class task11 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,6,2,12,65,34,78));
// Мое Решение:
        System.out.println(list);
        list.sort(null);
        System.out.println(list); // [1,2,4,6,12,34,65,78]

// Решение Преподавателя:
        task11 result = new task11();
        System.out.println(result.sortByCollections(list).toString());
        System.out.println(result.sortByComparator(list).toString());
    }
    public List<Integer> sortByCollections(List<Integer> list) { 
        Collections.sort(list);// алгоритм Натуральной сортировки для коллекций (по Возрастанию)
        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list) { 
        Collections.sort(list, Collections.reverseOrder());// алгоритм Натуральной сорт (по Убыванию)
// обращаемся к методу reversOrder в классе Collections
        return list;
    }
}