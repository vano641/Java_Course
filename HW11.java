import java.util.LinkedList;

/**
 * HW11 Реализуйте метод, который принимает LinkedList<String> и строку
 * и возвращает количество вхождений строки в список.
 */
public class HW11 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");

        String value;
        value = "apple";

        System.out.println(list); // [apple, banana, apple, pear, banana,]
        System.out.println(value); // apple
        System.out.println(count(list, value)); // ответ: 2
    }
    public static int count(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) { //Для сравнения строк используйте метод equals(). Этот метод позволяет сравнить
            count++;               // строку с другим значением и определить, равны ли они.
            }                      
        }
        return count;

    }
}