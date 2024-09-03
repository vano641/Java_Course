import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * task13 Дан Deque состоящий из последовательности цифр.
 * Необходимо проверить, что последовательность цифр является Палиндром
 * Т.Е читается одинаково с начала и с конца.
 */
public class task13 {
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,1));
    task13 Task13 = new task13();
    System.out.println(Task13.checkOn(deque));
}

public boolean checkOn(Deque<Integer> deque){
    if (deque == null) { // если в метод переданна Deque не инециализорованная, то бросаем исключение
        throw new IllegalStateException();
    }
    if (deque.size() <= 1) { // если размер 0 или 1, то по математике Пустота или 1 элемент
// по умолчанию симметричны т.е Палиндром
        return true;
    }
    while (deque.size() >= 2) { // цикл который проверяет элементы с начала и с конца
        if(deque.pollFirst() != deque.pollLast()){ // при получении Первого и Последнего элемента,
            // они удаляются из структуры и проверяются след. элементы
            return false; // если элементы не совпадают то false
        }
    }
    return true; // если ни разу не было false, то возвращаем true (последовательность =     Палиндром)
}
    
}
