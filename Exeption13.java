/**
 * Exeption13 
 * - Напишите метод, на вход которого подается Двумерный строковый массив размером 4*4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException
 * - Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в какой-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * - В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и My ArrayDataException
 * и вывести результат расчета (сумму элементов, при учловии, что подали на вход корректный массив).
 * 
 */
public class Exeption13 {

    public static void main(String[] args) {
        String[][] array = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        try {
            int sum = calculateSum(array); // вызываем метод и передаем в него наш массив
            System.out.println(sum);
        } 
        catch (MyArrayDataException e) { // обрабатываем возникшие исключения
            System.out.println(e.getMessage());
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
// метод подсчитывающий сумму (метод может бросать указанные исключения)
    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(); // проверяем размерность массива
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } 
                catch (NumberFormatException e) { // если не удалось считать Число, то бросим исключение
                    throw new MyArrayDataException("Неверные данные в ячейке ["+ i +"]["+ j +"]");
                }
            }
        }
        return sum;
    }
}
// создадим класс Исключений
class MyArraySizeException extends Exception {
    public MyArraySizeException() { // при вызове метода передаем сообщение
        super("Неверный размер массива, должен быть 4*4!");
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException(String msg) { // передадим Переменную типа String,
// чтобы была возможность указать Адрес ячейки с ошибкой
        super(msg);
    }
}

