import java.util.LinkedList;
import java.util.Stack;

/**
 * HW10 Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
 */
public class HW10 {

    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");
        System.out.println(stack); // Исходный LinkedList [grape, pear, banana, apple]

        stack.addFirst("element");
        System.out.println(stack); // [element, grape, pear, banana, apple]

        stack.removeFirst();
        System.out.println(stack); // [grape, pear, banana, apple]

        System.out.println(stack.peekFirst()); // grape

        


    }
}