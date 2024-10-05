/**
 * ExeptionHW5 Проверка корректности даты
Напишите метод, который проверяет, является ли введенная строка корректной
датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
об ошибке.

 */
public class ExeptionHW5 {

    public static void main(String[] args) {
        String date = "2024-02-29";
        String result = ExeptionHW5.validateDate(date);
        System.out.println(result);
    }
    public static String validateDate(String date){
        try {
            //Проверка длинны строки
            if (date.length() != 10) {
                return "Неверный формат даты. Введите дату в формате YYYY-MM-DD";
            }
            // Разделите строку на год, месяц и день, используя методы substring
            // для извлечения соответствующих частей строки
            String yearStr = date.substring(0, 4);
            String monthStr = date.substring(5, 7);
            String dayStr = date.substring(8, 10);
            
            // Проверка формата разделителей
            if (date.charAt(4) != '-' || date.charAt(7) != '-') {
                return "Неверный формат разделителей";
            }

            // Преобразуем компоненты в числа
            int year = Integer.parseInt(yearStr);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);

            //Проверка диапазона года
            if (year < 1 || year > 9999) {
                return "Неверный формат года. Должен быть от 0001 до 9999";
            }

            //Проверка диапазона месяца
            if (month < 1 || month > 12) {
                return "Неверный формат месяца. Должен быть от 01 до 12";
            }

            // Проверка количества дней в месяце
            int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
            if (month == 2 && isLeapYear(year)) {
                daysInMonth[1] = 29; // Февраль в високосный год
            }
            if (day < 1 || day > daysInMonth[month - 1]) {
                return "Количество дней не соответствует кол-ву дней месяца";
            }
            return date;

        } catch (NumberFormatException e) {
// В случае ошибки преобразования чисел
            return "Ошибка преобразования чисел";
        }
        catch (Exception e){
// В случае других ошибок
            return "При проверки введенной даты произошла ошибка";
        }
    }

// Метод проверки високосного года:
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}