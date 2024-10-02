import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
/**
 * Exeption9 Запишите в файл следующие строки:
 * Анна = 4
 * Елена = 5
 * Марина = 6
 * Владимир = ?
 * Константин = ?
 * Иван = 4
 * Реализуйте метод который считывает данные из файла и сохраняет в двумерный массив ( либо HashMap)
 * В отдельном методе пройти по структуре данных.
 * Если сохранено значение "?", заменить его на соответствующее число.
 * Если на каком-то месте встречается символ, отличный от "числа" или "?",
 * бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами "?".
 */
public class Exeption9 {
    public static void main(String[] args) {
// прочитаем данные из файла и положим их в структуру
        HashMap<String, Integer> map = readData("Exeption9File.txt");
        writeData("Exeption9File.txt", map);
    }
// Записываем данные в файл обратно
// Передаем в метод Имя файла и полученный HashMap
    public static void writeData(String FileName, HashMap<String, Integer> map){
        try {
// Попробуем открыть файл            
            File file = new File(FileName);
            FileWriter writer = new FileWriter(file);
// пройдем по HashMap и добавим построчно
            for (String name : map.keySet()) {
                int value = map.get(name); // буфер для записи значения на каждой итерации
                writer.write(name + "=" + value + "\n");
            }
            writer.close();
        } 
        catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
// Метод считывающий данные, передаем в метод название файла
    public static HashMap<String, Integer> readData(String FileName){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
    
        try {
            File file = new File(FileName); // попытаемся открыть файл
            Scanner scanner = new Scanner(file);
 // прочтем все строки по порядку           
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
// в строке лежит Имя=Число, разделим их по знаку "=" на две части
                String[] parts = line.split("="); // переменная для накопления частей строки
// проверим, что у нас есть и Первая часть и Вторая                
                if (parts.length != 2) {
// если какой-то части не хватает(сообщение и укажем эту строку)
                    throw new IllegalArgumentException("Неверные данные в строке: " + line);
                }
                String name = parts[0]; // имя содержится в первой части
                String value = parts[1];// во второй части содержится значения
// попробуем перевести это значение в число        
                int valueint = 0;
                if (value.equals("?")) { // если в значении "?"
                    valueint = parts[0].length(); // заменим его на Длинну имени
                }
                else { // если это не "?", попробуем преобразовать Символ в число
                    try {
                        valueint = Integer.parseInt(value);
                    }
// обработаем исключения
                    catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неверный формат числа! " + line, e);
                    }
                }
                map.put(name, valueint); // добавим наше значение в Структуру
            }
            scanner.close(); // закроем сканер
        } 
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        return map;// вернем Структуру map
    }
    
}