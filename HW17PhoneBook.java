import java.util.*;
/**
 * HW17PhoneBook PhoneBook HW17TelephoneBook Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */
public class HW17PhoneBook {
// Телефонная книга в виде HashMap Ключ - name, Значение - Список из phoneNumber
    HashMap<String, List<String>> Contakt = new HashMap<String, List<String>>();

    public HW17PhoneBook(){
        this.Contakt = new HashMap<>();
    }

// Добавление номера телефона в HashMap
    public void addContakt(String name, String phoneNumber){
// если Ключ name уже добавлен, то к нему добавляется только значение(phoneNumber) в список
// если нет, то добавляется Пара Ключ/Значение
        Contakt.computeIfAbsent(name, i -> new ArrayList<>()).add(phoneNumber);
    }

// Печать Телефонной Книги в порядке убывания (количества контактов)
    public Map<String, List<String>> getContakts(){
        // TreeMap bufer сортирует данные по ключу(ключом будет количество телефонов/значение name)
        TreeMap<Integer, String> bufer = new TreeMap<>();
        Integer count = 0; // счетчик телефонов
        //проходим по HashMap Телефонной книге
        for (HashMap.Entry<String, List<String>> i : Contakt.entrySet()) {
            // внутри пары String/List<String> проходим по List<String> (список номеров данного Ключа)
            for (String j : i.getValue()) {
                count += 1; // считаем количество номеров данного ключа i
            }
            bufer.put(count, i.getKey()); // Записываем количество номеров в Ключ, Имя в Значение TreeMap bufer
            count = 0;// обнуляем счетчик номеров для следующего Контакта
        }

// на выходе получаем bufer {1=Kristina, 2=Artem, 3=Ivan}
// далее используя функцию Разворота TreeMap bufer.descendingMap() {3=Ivan, 2=Artem, 1=Kristina}
// и свойcтва LinkedHashMap(запоминать порядок добавления)
        Map<String, List<String>> res = new LinkedHashMap<>();
        //проходим по bufer в порядке убывания
        for (Map.Entry<Integer, String> i : bufer.descendingMap().entrySet()) {
            // проходим по HashMap Телефонной книге
            for (Map.Entry<String,List<String>> j : Contakt.entrySet()) {
                // если Значение bufer(Имя контакта) == Ключу Contakt
                if (i.getValue() == j.getKey()) {
                    // добавляем Ключ/Значение Contakt в результирующий LinkedHashMap
                    res.put(j.getKey(), j.getValue()); 
                }
            }
        }
        return res; //{Ivan=[1111111111, 2222222222, 3333333333], Artem=[4444444444, 5555555555], Kristina=[6666666666]}
    }

    public static void main(String[] args) {
        HW17PhoneBook Contakt = new HW17PhoneBook();
        // добавляем контакты в Телефонную Книгу
        Contakt.addContakt("Ivan", "1111111111");
        Contakt.addContakt("Ivan", "2222222222");
        Contakt.addContakt("Ivan", "3333333333");
        Contakt.addContakt("Artem", "4444444444");
        Contakt.addContakt("Artem", "5555555555");
        Contakt.addContakt("Kristina", "6666666666");

        System.out.println(Contakt.getContakts()); 
        //{Ivan=[1111111111, 2222222222, 3333333333], Artem=[4444444444, 5555555555], Kristina=[6666666666]}
    }
}