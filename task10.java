/**
 * task10 Даны следующие строки.
 * Сравнить их с помощью == и метода equals() класса Object
 * и понять в чем разница
 * String s1 = "hello";
 * String s2 = "hello";
 * String s3 = s1;
 * String s4 = "h" + "e" + "l" + "l" + "o";
 * String s5 = new String("hello");
 * String s6 = new String(new char[]{'h','e','l','l','o'});
 */
public class task10 {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});
// == используем только для примитивов
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // true
// В памяти есть целая структура "Пул Строк". Когда мы создаем строку s1 механизм движка java
// проверяет "Пул Строк" на наличие в нем ранее созданной строки с Таким же значением, если
// не находит, то он добавляет ее в память и возвращает Ссылку на этот объект.
// При проверке s2 механизм видит, что ранее был создан объект с таким же значением "hello"
// => он не создает новую ссылку, а возвращает существующую ссылку (от s1) ранее созданную
// с таким же значением => true
        System.out.println(s1 == s5); // false 
        System.out.println(s1 == s6); // false т.к при использовании конструктора new String
// мы принудительно заставляем механизм языка JAVA создавать новую ссылку в "Пуле Строк"
// для нашего объекта с этим значением => отключаются механизмы оптимизации памяти и 
// для объектоы s5 b s6 присваиваются разные ссылки ( отличные от ссылки s1) => false
        System.out.println(" ");
// для Объектов используем equals()
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1.equalsIgnoreCase(s6)); // true // игнорирует Регистр в строках
        
    }
}