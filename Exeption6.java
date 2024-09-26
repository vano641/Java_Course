/**
 * Exeption6  Реализуйте метод, принимающий в качестве аргументов двумерный массив.
 * Метод должен проверить, что длинна Строк и Столбцов с одинаковым Индексом одинакова.
 * (детализировать какие Строки и Слолбцы не требуется)
 */
public class Exeption6 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        if (checkArray(arr)) {
            System.out.println("Количество Строк и Столбцов совпадает");
        }
        else {
            System.out.println("Количество Строк и Столбцов НЕ совпадает");
        }
    }
// метод проверки массива (true/false)
    public static boolean checkArray(int[][] arr){
        int rows = arr.length; // посчитаем количество Строк
        if (rows == 0) { // если Строк 0, значит и столбцов тоже 0 => true
            return true;
        }
        // Пройдем по строкам и проверим длинну Столбцов 
        for (int i = 1; i < rows; i++) {
            if (arr[i].length != rows) {
                return false;
            }
        }
        return true;
    }
}