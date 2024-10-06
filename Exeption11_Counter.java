import java.io.IOException;
// создадим Класс Exeption11_Counter, укажем, что он должен быть AutoCloseable
public class Exeption11_Counter implements AutoCloseable {
    private int count; // зададим переменную счетчик
    private boolean closed = false; // добавим флаг (наш обьект(счетчик) открыт или закрыт)

    //Метод add() увеличивающий значение переменной на 1
    public void add() throws IOException { // метод должен возврвщвть исключение
        if (closed) { // вернем исключение в том случае если Объект закрыт 
            throw new IOException("Обьект закрыт");
        }
        count++; // иначе увеличим счетчик (если обьект открыт)
    }

// Для удобства добавим метод печати счетчика
    public String toString(){
        return String.valueOf(count);
    }

// Класс счетчика (Exeption11_Counter) требует реализации метода закрытия
    @Override
    public void close() throws Exception {
// в случае Закрытия обьекта будем присваивать Флагу значение true        
        closed = true;
    }
}
