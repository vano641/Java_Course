/**
 * Exeption2 Реализуйте метод принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его Индекс. При этом:
 *  1) Если длинна массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
 *  2) Если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 *  3) Если вместо массива пришел null, метод вернет -3 код ошибки
 *  4) Свой вариант
 * Реализовать взаимодействие с пользователем. Т.е этот метод запросит искомое число у пользователя,
 * вызовет Первый метод, обработает возвращенное значение и покажет Читаемый результат пользователю.
 * Например, если вернулся -2, то пользователь увидит сообщение "Искомый элемент не найден"
 */
public class Exeption2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int element = 3;
        int result = searchElement(arr, element);
        if (result == -1) {
            System.out.println("Длинна массива меньше 3");
        } else if (result == -2){
            System.out.println("Искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("Массив Пустой");
        } else {
            System.out.printf("Искомый элемент имеет индекс %d", result);
        }
    }
    
    public static int searchElement(int[] arr, int element){
        if (arr == null) { // если массив Пустой
            return -3;
        }
        int min_length = 3; // задаем минимальную длинну
        if (arr.length < min_length) { // если Длинна массива меньше Заданного значения
            return -1;
        }
        // выполним поик по массиву 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // если элемент найден возвращаем индекс
            }
        }
        return -2; // если искомый элемент не найден
    }
}