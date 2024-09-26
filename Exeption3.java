/**
 * Exeption3 Реализуйте метод принимающий в качестве аргумента целочисленный Двумерный массив.
 * Необходимо посчитать и вернуть Сумму элементов этого массива.
 * При этом на метод накладываем 2 ограничения:
 *      1) Метод может работать только с Квадратными массивами (кол-во строк = кол-ву столбцов).
 *      2) В каждой ячейке может лежать только значение 0 и 1
 * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Exeption3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,1},{0,0,2}};
        int sum = sumElements(matrix);
        System.out.println(sum); 
    }
    public static int sumElements(int[][] matrix){
        //найдем длинну массива и проверим является ли он квадратным.
        int n = matrix.length;
        //пройдем по всем строкам и сравним с длинну строки с полученной длинной
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new RuntimeException("Кол-во строк Не равно кол-ву столбцов");
            }
        }
        // проверим, что в каждой ячейке у нас лежит 0 и 1
        for (int[] row : matrix) { // пройдем по каждой строке
            for (int element : row) { // проверяем каждый элемент в строке
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }
        // посчитаем сумму элементов
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}