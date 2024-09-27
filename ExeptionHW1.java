/**
 * ExeptionHW1 Преобразование Строки в Число
 * Реализуйте метод convertAndSum, который принимает массив строк, каждая
из которых(строка) должна быть преобразована в целое число.
        Метод возвращает сумму всех чисел. 
    1) Если хотя бы одна строка не может быть преобразована в
число, метод должен выбросить исключение NumberFormatException.
    2)Дополнительно, если сумма чисел превышает 100, выбрасывайте
ArithmeticException с сообщением "Превышен лимит суммы".
 */
public class ExeptionHW1 {
    public static void main(String[] args) {
        String[] arr = {"abc", "20", "70"}; 
        int result = convertAndSum(arr);
        System.out.println(result);
// 100 ; {"10", "20", "70"} 
// {"20", "20", "70"} => Exception in thread "main" java.lang.ArithmeticException: Сумма чисел > 100
// {"abc", "20", "70"} => Exception in thread "main" java.lang.NumberFormatException: Ошибка преобразования Строки в Число abc
    }
    public static int convertAndSum(String[] arr){
        int sum = 0;
        for (String i : arr) {
            try {
                int number = Integer.parseInt(i);
                sum += number;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Ошибка преобразования Строки в Число " + i);
            }
        }
        if (sum > 100) {
            throw new ArithmeticException("Сумма чисел > 100");
        }
        return sum;
    }

    
}
