import java.util.*;
import java.util.Scanner;
/**
 * Exeption7 Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и обоснуйте свое решение12
 */
public class Exeption7 {

    public static void main(String[] args) {
/**     Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt(); // если ввести 1, то =>
        try {
            arr[index] = 1;
        } catch (Exception e) {
            System.out.println("Указанный индекс за пределами массива");
        }
        System.out.println(Arrays.toString(arr));// => [0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
/** 1) если ввести цифру входящую в размер массива, то все ок
 *  2) если ввести цифру которая Выходит за пределы массива, то сработает Exception:
 *          Указанный индекс за пределами массива [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 *  3) если ввести Не цифру, а Символ, то мы получим Исключение, которое НЕОБХОДИМО ОБРАБОТАТЬ
 */
// Обработаем данные исключения с помощью блока IF
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = 0; // Текущий индекс
// Проверяем какое значение пришло со сканера:
        if (scanner.hasNextInt()) { // если пришло числовое значение
            index = scanner.nextInt();//, то присвоим значение нашему текущему индексу
        }
        else { // иначе выдадим сообщение пользователю
            System.out.println("Укажите индекс элемента массива - целое число");
        }
        if (index > arr.length) {
            System.out.println("Указан индекс который находится за пределами массива");
        }
        else {
            arr[index] = 1; // значение 1 подставляем в Указанный индекс, если он не выходит за границы массива
            System.out.println(Arrays.toString(arr));
        }
    }
}