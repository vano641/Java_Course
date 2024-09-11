import java.util.Deque;
import java.util.LinkedList;

/**
 * HW13 Удаление слова из очереди
 * Реализуйте метод, который принимает Deque<String> и строку value. 
 * Метод должен удалить все вхождения строки value из очереди
 */
public class HW13 {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("apple");
        deque.add("banana");
        deque.add("apple");
        deque.add("cherry");
        String value = "apple";
        System.out.println(deque); //[apple, banana, apple, cherry]
//Решение:
/**Чтобы удалить все вхождения строки из очереди, вы можете использовать метод
removeIf, который принимает предикат для фильтрации элементов. Вам нужно
создать предикат, который будет проверять, совпадает ли элемент с заданной строкой. */

/**Метод removeIf удаляет все элементы, для которых предикат возвращает true. В
вашем случае, предикат должен возвращать true, если элемент равен строке value,
чтобы удалить все вхождения. */
        deque.removeIf(element -> element.equals(value));
        System.out.println(deque); //[banana, cherry]
    }
}