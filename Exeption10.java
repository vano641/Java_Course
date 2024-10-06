/**
 * Exeption10 Обработка исключений выше по Стеку
 * Создайте метод doSomething(), который может быть источником
 * одного из типов checked exceptions (тело самого метода прописывать не нужно).
 * Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
 * метод doSomething().
 */
import java.io.IOException;
public class Exeption10 {
    public static void main(String[] args) {
        try {
            doSomething();
        }
        catch (IOException e) {
            System.out.println("Исключение ввода-вывода");
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException();
    }
    
}