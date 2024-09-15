import java.util.HashMap;
import java.util.Map;

/**
 * task17 Дан массив Путей, где пути[i] = ["Город А, Город Б"] означают, что существует прямой путь
 * от Города А до Города Б. Верните город назначения. Т.е город из которого нет пути дальше.
 * Например: [["Моссква", "Cамара"], ["Курск", "Пенза"], ["Самара","Курск"]]
 * Результат: Пенза т.к из него нет пути дальше
 */
public class task17 {

    public static void main(String[] args) {
        Map<String, String> path = new HashMap<>();
        path.put("Москва", "Самара");
        path.put("Курск", "Пенза");
        path.put("Самара", "Курск");
        task17 t = new task17();
        System.out.println(t.getFinalCity(path));
    }
    public String getFinalCity(Map<String, String> path){;
// пройти по всем значения которыеесть в map т.е перебераем все пункты назначений
// и ищем которого нет в списке ключей
        for (String end : path.values()) {
            if (!path.containsKey(end)) {
                return end;
            }
        }
        return null;
    }
}