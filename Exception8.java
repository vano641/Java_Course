/**
 * Exception8
 */
public class Exception8 {

    public static void main(String[] args) {
        String[][] arr = {{"1","1","1","1","1","1"}, {"1","1","1","1","1","1"}, {"1","1","1","1","1","A"}};
        System.out.println(sum2d(arr));// если все 1цы, то =>18, если буква А, то =>17(символ воспринимается как 0)
    }
/** public static int sum2d(String[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
*/
/**  1) Может придти Пустой массив
     2) Внутри цикла есть итерирование до размера 5, если придет массив Меньшей длинны, то
мы получим исключение выхода за пределы массива.
     3) Если в массиве встретятся элементы которые мы не сможем сконвертировать в целое число,
то мы не сможем произвести суммирование (Исключение преобразование типов)
*/
    public static int sum2d(String[][] arr){
        int sum = 0;
// Проверим, что массив Не Пуст:
        if (arr != null) {
            for(int i = 0; i < arr.length; i++){
// Добавим во внутренний цикл проверку на то, что наша Переменная не выходит
// за пределы массива
                for (int j = 0; j < arr[0].length; j++) {
                    int val = tryParseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

// Отдельный метод для проверки пришло нам Число или Нет (добавим Парсер)
    public static int tryParseInt(String a){ //Метод возвращает Целое число (Результат конвертации), на входе Строка
        
        try {
            return Integer.parseInt(a); // переводим полученное Значение в число
        } catch (NumberFormatException e) { // если это не удалось сделать, то возвращаем 0 т.к все Битые значения Заполняем 0
            return 0;
        }
    }
}