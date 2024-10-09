/**
 * ExeptionHW9Final . Проверка корректности Введенных данных
Напишите приложение, которое будет запрашивать у пользователя следующие
данные, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
    фамилия, имя, отчество - строки
    дата_рождения - строка формата dd.mm.yyyy
    номер_телефона - целое беззнаковое число без форматирования
    пол - символ латиницей f или m.
Приложение должно проверить введенные данные по количеству(всего 6). Если
количество не совпадает с требуемым, вернуть код ошибки, обработать его и
показать пользователю сообщение, что он ввел меньше и больше данных, чем
требуется.

Приложение должно попытаться распарсить полученные значения и выделить из
них требуемые параметры. Если форматы данных не совпадают, нужно бросить
исключение, соответствующее типу проблемы. Можно использовать встроенные
типы java и создать свои. Исключение должно быть корректно обработано,
пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием,
равным фамилии, в него в одну строку должны записаться полученные данные,
вида:
    <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно
быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExeptionHW9Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ввод двнных от пользователя
        System.out.println("Введите свои данный в формате (Фамилия Имя Отчество датарождения номертелефона пол)");
        String input = scanner.nextLine(); // Чтение введенных данных
        scanner.close();

        try {
            String[] parts = input.split(" "); // Разделение данных по пробелам
            if (parts.length != 6) {
                throw new IllegalArgumentException("Введено не верное количество данных. Ожидается 6");
            }
// Запишем извлеченные данные в свои переменные
            String surname = parts[0];
            String name = parts[1];
            String middleName = parts[2];
            LocalDate dateOfBirth = parseDate(parts[3]);
            long phoneNumber = parsePhoneNumber(parts[4]);
            char gender = parseGender(parts[5]);
// Запись данных в Файл
            writeToFile(surname, name, middleName, dateOfBirth, phoneNumber, gender);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Неправильное коло-во данных или формата
        } catch (DateTimeParseException e) {
            System.out.println("Error: Неверный формат даты. dd.MM.yyyy" );
        } catch (IOException e) {
            e.printStackTrace(); // вывод Стектрейса в случае ошибки  ввода/вывода
        }
    }

// Метод для Разбора и Валидации даты
    private static LocalDate parseDate(String dateStr) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateStr, formatter);
    }
// Метод для разбора и валидации номера телефона
    private static long parsePhoneNumber(String phoneNumberStr) {
        try {
            return Long.parseLong(phoneNumberStr);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат ввода номера телефона");
        }
    }
// Метод для разбора и валидации пола.
    private static char parseGender(String genderStr){
        // проверка длинны строки и допустимых значений
        if (genderStr.length() != 1 || !(genderStr.equalsIgnoreCase("f") || genderStr.equalsIgnoreCase("m"))) {
            throw new IllegalArgumentException("Неверный тип пола. Ожидается 'f' или 'm'.");
        }
        return genderStr.toLowerCase().charAt(0);
    }
// Метод для записи данных в Файл
    private static void writeToFile(String surname, String name, String middleName, LocalDate dateOfBirth, 
    long phoneNumber, char gender) throws IOException {
        // формирование имени файла
        String filename = surname + ".txt";
        // формирование строки для записи
        String line = String.format("%s %s %s %s %d %c", surname, name, middleName, dateOfBirth, phoneNumber, gender);
        // запись строки в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(line);
            writer.newLine(); // переход на новую строку
        }  
    }
}