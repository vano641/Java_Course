/**
 * Exeption11 try-with-resourses
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с обьектом такого типа можно было работать в блоке try-with-resourses.
 *      Что должно происходить при закрытии этого ресурса?
 *      Напишите метод для проверки, закрыт ли ресурс.
 *      При попытке вызвать add() у зарытого ресурса, должен выброситься IOException
 */
public class Exeption11 {
    public static void main(String[] args) throws Exception { // добавим то, что мы можем отбрасывать исключения throws Exception
// Вызовем Класс Exeption11_Counter в блоке try-with-resourses        
        try (Exeption11_Counter counter = new Exeption11_Counter()) {
            System.out.println(counter); // печатаем состояние счетчика
            counter.add(); // вызовем метод add() который должен увеличить счетчик на 1
            System.out.println(counter); // еще раз напечатаем состояние счетчика
        }
// Что может быть если вызвать метод add() вне try-with-resourses
/**     Exeption11_Counter counter = new Exeption11_Counter();
        System.out.println(counter); // все верно печатается 0
        counter.add();
        System.out.println(counter); // печатается 1
*/
/**         
        counter.close(); // если Закрыть Объект и попытаться вызвать метод add()
        counter.add(); // получим Исключение "Объект закрыт"
*/
    }
    
}

