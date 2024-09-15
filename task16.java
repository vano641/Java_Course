import java.util.*;

/**
 * task16 Дана последовательность чисел. Нкеобходимо вернуть сумму уникальных чисел
 * Пример [1,2,2,3] (числа которые имеют пару не суммируем)
 * Результат 1+3 = 4
 * Решить с помощью HashMap
 */
public class task16 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3);
        task16 Task16 = new task16();
        System.out.println(Task16.getSumOfUniqueValues(list));
    }
    public Integer getSumOfUniqueValues(final List<Integer> list){
        if (list == null || list.isEmpty()) { // если последовательность не заданна или пустая последоваьтельность, то запускакать алгоритм нет смысла
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>(); // map в которую складываем значения уникальных чисел
        for (Integer num : list) { // проходим по всей последовательности list 1,2,2,3
            if (map.containsKey(num)) {// смотрим хранится ли в map текущее значение num(1,2,2,3)
                map.put(num, map.get(num)+1);// если да, то перезаписываем это значение с Ключонм num и текущим значением +1
            } else {
                map.put(num, 1); // если num не находится, то добавляем его со значением 1
            }
// далее проходим по Ключам, проверяем их значения, если они отличны от 1, то мы Не должны их суммировать
// т.е создаем временную переменную counter и суммируем все значения которые Не превышают 1
        }
        int counter = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) == 1) {
                counter = counter + num;
            }
        }
        return counter;
    }
}