import java.util.*;
/**
 * HW14  Студенческий справочник
Реализуйте программу для работы с простым справочником студентов.
Программа должна иметь следующие функции:
● addStudent(String name, Integer grade): Добавляет или
обновляет запись о студенте с именем name и оценкой grade. Если
студент уже существует, обновляет его оценку.
● findStudent(String name): Находит оценки студента по его имени.
Если студент существует, возвращает список его оценок. Если нет —
пустой список.
● getAllStudents(): Возвращает весь справочник студентов в виде
HashMap, где ключи — имена студентов, а значения — списки их оценок.
● removeStudent(String name): Удаляет запись о студенте по имени
из справочника. Если запись не существует, ничего не происходит.
 */
public class HW14 {

    public static void main(String[] args) {
        HashMap<String, Integer> directory = new HashMap<>();
        directory.put("Ivan", 70);
        directory.put("Kristina", 85);
        directory.put("Artem", 95);
        HW14 res = new HW14(); 
        System.out.println(directory);
        System.out.println(res.add(directory)); // Добавление Студента
        System.out.println(res.value(directory)); // Получение оценки студента по Имени(ключу)
        System.out.println(res.returnHashMap(directory)); // Возвращает Весь справочник Ключи и Значения
        System.out.println(res.remove(directory)); // Удаляет Студента по Ключу
    }
    public HashMap<String, Integer> add(HashMap<String, Integer> directory){
        directory.put("Luda", 90); // Добавляет новый Ключ(Студента) если его нет
        directory.put("Artem", 90); // Переписывает оценку если такой Ключ(Студент есть)
        return directory;
    }
    public Integer value(HashMap<String, Integer> directory){
        Integer valueStudent = 0;
        valueStudent = directory.get("Kristina"); // выводит значение по Ключу = 85
        //valueStudent = directory.get("Alex"); если Ключа нет, то выводит null
        return valueStudent;
    }
    public HashMap<String, Integer> returnHashMap(HashMap<String, Integer> directory){
        return directory;
    }
    public HashMap<String, Integer> remove(HashMap<String, Integer> directory){
        directory.remove("Ivan"); // Удаляет Студента по Имени(ключу)
        return directory;
    }

}
