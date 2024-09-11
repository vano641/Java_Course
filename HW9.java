import java.util.LinkedList;

/**
 * HW9 Дан LinkedList с несколькими элементами. В методе
removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */
public class HW9 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        System.out.println(ll); // Исходный ll [apple, banana, pear, grape]

        LinkedList<String> toRemove = new LinkedList<>(); // Буферный список куда сохраняем Нечетные элементы
        for (String s : ll) { // foreach проходим по ll
            if (s.length() % 2 != 0) {
                toRemove.add(s); // добавляем элементы с нечетным количеством символов в Буферный список
            }
        }
        ll.removeAll(toRemove); // удаляем из Исходного списка все элементы входящие в Буферный список (Нечетные)
        System.out.println(ll); // Результат [banana, pear]
    }
    
}