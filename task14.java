import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * task14 Даны два Deque представляющие два неотрицательных целых числа. 
 * Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру( т.е каждая цифра хранится в своей клетке).
 * Сложите два числа и верните сумму в виде связного списка.
 */
public class task14 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        task14 Task14 = new task14();
        System.out.println(Task14.sum(d1, d2).toString());
    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        if (d1 == null || d2 == null) { // проверка входных данных(не пустые они?)
            throw new IllegalStateException();
        }

        Deque<Integer> result = new ArrayDeque<>(); // структура для хранения результата
        int digit = 0; // врем. перем. со значением 0

        while (d1.size() > 0 || d2.size() > 0) {
            int sum = 0 + digit; //временная перем. sum(которая хранит сумму двух чисел) в сумму добавляем значение digit
            digit = 0; // обнуляем digit

            if (d1.size() > 0) { // проверяем первую структуру d1 на наличие в ней элементов
                sum = sum + d1.poll(); // и добавляем его значение в нашу сумму(затем этот элемент удаляется из d1)
            }
            if (d2.size() > 0) { // тоже самое для второй структуры d2
                sum = sum + d2.poll();
            }
            if (sum > 9) { // когда сумма сформированна мы проверяем является ли она > 9
                digit = 1; // если Да, то присваиваем digit = 1
                sum = sum - 10; // а из суммы вычитаем 10
            }
            result.offer(sum);// добавляем сумму в результат
        }
        if(digit != 0){ // когда на последней итерации остались десятки, их нужно перенести
            result.offer(digit);
        }
        return result;
    }
}