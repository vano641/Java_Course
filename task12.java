/**
 * task12 Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и числа в строковом формате.
 * Пройти по списку, вывести информацию, какое значение - Строка, а какое - Число
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class task12 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1","I","5","A"));
            task12 res = new task12();
            res.printResultOfCheck(list);
    }
    public void printResultOfCheck(List<String> list){
// Проходим по входному списку (foreach).
        for (String i : list) {
// Далее мы должны проверять каждый элемент является он Строкой или Числом в Строковом формате
            try {
                int j = Integer.valueOf(i); // создаем int переменную и пытаемся СПарсить в нее 
// значение элемента [i], если это не удалось значит([i] - не является числом)
// будет Исключение которую мы должны обработать в catch
                System.out.println(j + "- число"); 
            } catch (NumberFormatException e) {
                System.out.println(i + "- строка");
                
            }
        }
    }
}