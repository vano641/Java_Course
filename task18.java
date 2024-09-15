import java.util.*;
/**
 * task18 Дана Строка. Написать метод который отсортирует слова в строке по Длинне с помощью TreeMap
 * Строки с одинаковой длинной не должны "потеряться"
 */
public class task18 {

    public static void main(String[] args) {
        String s = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
// {1=[Я], 2=[ты], 3=[Как], 4=[мной], 5=[помню, гений], 6=[чудное, Передо, чистой], 7=[явилась, виденье, красоты], 9=[мгновенье], 10=[мимолетное]}
        task18 t = new task18();
        System.out.println(t.getSorted(s));
    }

    public String getSorted(final String s){
        if (s == null || s.isEmpty()) {
            return null;
        }
// разобьем исходную строку на слова по пробелам
        Map<Integer, List<String>> result = new TreeMap<>(); // TreeMap для хранения результатов расчетов
        List<String> tempList; // временнаяс коллекция типа String
        for (String subWord : s.split(" ")) { // проходим по словам из исходной строки
            int size = subWord.length(); // во врем. перем запоминаем длинну этого слова
// далее проверяем есть ли в нашем result ключи с размером нашего текущего слова
// и если есть то далее проверяем на избежание дублирование
            if (result.containsKey(size) && !result.get(size).contains(subWord)) {
                tempList = result.get(size); // если да то во врем. коллекцию передаем ту структуру 
                //которая лежит по нашему ключу
            } else {
                tempList = new ArrayList<>(); // иначе передаем новую структуру
            }
            tempList.add(subWord);// затем к врем.кол добавляем текущее слово
            result.put(size, tempList);//  и привязываем в result ключ(размер текущего слова) значение - врем.кол
        }
        return result.toString();
    }
}
