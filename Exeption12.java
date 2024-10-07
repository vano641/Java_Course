/**
 * Exeption12 Создание собственных исключений.
 * - Создайте класс исключения, который будет выбрасываться при делении на 0. Сообщение для пользователя об ошибке
 * - Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. Сообщение для пользователя об ошибке
 * - Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Сообщение об ошибке для пользователя.
 */
public class Exeption12 {
    public static void main(String[] args) {
        
    }
// создадим свой класс исключений Деления на ноль
    public class DivisionByZeroException extends Exception {
        public DivisionByZeroException(){
            super("Делить на Ноль нельзя!"); // добавим сообщение
        }
    }
// класс исключений Обращения к пустому элементу
    public class NullArrayElementException extends Exception {
        public NullArrayElementException(){
            super("Обращение к пустому элементу массива");
        }
    }
// класс исключений Открытия не существующего файла
    public class FileNotFoundException extends Exception {
        public FileNotFoundException(){
            super("Файл не найден!");
        }
    }
}