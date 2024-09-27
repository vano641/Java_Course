import java.util.*;

/**
 * ExeptionHW4 Поиск и замена строк
Реализуйте метод findAndReplace, который принимает массив строк, строку
для поиска и строку для замены. 
    Если искомая строка не найдена, добавьте сообщение об ошибке в список. 
Верните новый массив строк с выполненной заменой.

 */
public class ExeptionHW4 {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        String[] strings = {"apple", "banana", "cherry", "date"};
        String target = "bananaS";
        String replacement = "orange";
        String[] result = findAndReplace(strings, target, replacement, errors);
        System.out.println("Результат замены: " + Arrays.toString(result));
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки: ");
            System.out.println(errors);
        }
    }
    public static String[] findAndReplace(String[] strings, String target, String replacement, List<String> errors){
        boolean found = false;
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(target)) {
                result[i] = replacement;
                found = true;
            } else {
                result[i] = strings[i];
            }
        }
        if (!found) {
            errors.add("Искомая строка \" " + target + " \" не найдена");
        }
        return result;
    }
    
}
