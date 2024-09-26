import java.util.*;
/**
 * Exeption4 Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив
 * Метод должен пройтись по каждому элементу и проверить, что он не равен null.
 *      А теперь реализуйте следующую логику:
 * 1) Если в какой-то ячейке встретился null, то необходимо "оповестить" об этот пользователя
 * 2) Есл null'ы встретились в нескольких ячейках, то идевльно было бы все их "подсветить".
 */
public class Exeption4 {
    public static void main(String[] args) {
        Integer[] arr = {1,null, 2, 3, null};
        List<Integer> nullElements = checkArray(arr); // поместим в список результат работы метода
        // добавим проверку на то, что вернувшийся список имеет  некоторые индексы
        if (nullElements.size() > 0) {
            System.out.println("Массив содержит пустые элементы на позициях" + nullElements);
        } else {
            System.out.println("Массив не содержит пустых значений");
        }
    }
    // Метод проверки массива (возвращает список)
    public static List<Integer> checkArray(Integer[] arr){
        List<Integer> nullElements = new ArrayList<>(); // результ список
        // пройдем по массиву
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == null) {
                nullElements.add(i); // добавляем индексы элементов в результ список
            }
        }
        return nullElements;
    }
}
