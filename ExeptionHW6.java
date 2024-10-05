/**
 * ExeptionHW6  Проверка строки на палиндром
Напишите метод, который проверяет, является ли введенная строка
палиндромом. Если строка палиндром, возвращайте "Palindrome". Если нет
— "Not a palindrome".
 */
public class ExeptionHW6 {

    public static void main(String[] args) {
        String input = "A man a plan ab canal Panama";
        boolean result = ExeptionHW6.isPalindrome(input);
        if (result == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    public static boolean isPalindrome(String input){
        try {
// Удаляем пробелы с помощью метода replace(" ", "") и
// переводим строку в Нижний регистр toLowerCase()   
            String cleanedInput = input.replace(" ", "").toLowerCase();

// Получаем длинну строки:
            int length = cleanedInput.length();
            
// Проверяем является ли строка палиндромом:
            for (int i = 0; i < length / 2; i++) {
                if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                    return false; // строка не является палиндромом если первый символ != последнему на каждой итерации
                }
            }
            return true; // строка является палиндромом
        } catch (Exception e) {
// В случае ошибки(например, если входные данные некорректны)
            System.out.println("При проверке на палиндром произошла ошибка");
            return false;
        }
    }
}