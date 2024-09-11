import java.util.Deque;
import java.util.LinkedList;

/**
 * HW12 Сдвиг Очереди. Реализуйте метод, который принимает
    Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
    позиций. Если n отрицательное, повернуть влево.
 */
public class HW12 {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        int n = 3;
        System.out.println(deque); // [1, 2, 3, 4]
//Решение:
        if (deque.isEmpty()) return;
        int size = deque.size(); //Поскольку очередь может быть вращена на большее количество позиций, чем её
        n = n % size;           //размер, сначала упростите значение n, используя остаток от деления на размер
                                //очереди (n % size). Это поможет избежать лишних циклов вращения. */

        if (n < 0) {    //Если n отрицательное, преобразуйте его в эквивалентное положительное значение
            n += size;  // для вращения вправо. Например, если n равно -3 и размер очереди size равен 5, то
        }               //вам нужно добавить size к n, чтобы получить эквивалентное положительное значение
                        //вращения. */
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst()); // Для вращения очереди вправо на n позиций используйте метод addLast для
        }                                       //добавления элемента в конец очереди и removeFirst для удаления элемента из
        System.out.println(deque);             //начала очереди. Если n отрицательное, это означает, что нужно вращать влево.
    }
}