/**
 * HW5: Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
    int[] arr - числовой массив
    После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате
    год-месяц-день час:минуты {массив на данной итерации}.
    Для логирования использовать логгер logger класса BubbleSort.
    Пример:
    arr = new int[]{9, 4, 8, 3, 1};
    sort(arr)
    // При чтении лог-файла получим:
    2023-05-19 07:53 [4, 8, 3, 1, 9]
    2023-05-19 07:53 [4, 3, 1, 8, 9]
    2023-05-19 07:53 [3, 1, 4, 8, 9]
    2023-05-19 07:53 [1, 3, 4, 8, 9]
    2023-05-19 07:53 [1, 3, 4, 8, 9]
 */
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HW5 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {

        int[] mas = new int[]{9, 4, 8, 3, 1};

        try {
            log = new File("log.txt");
            log.createNewFile(); // создаем новый файл
            fileWriter = new FileWriter(log);
            bubbleSort(mas);

            } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
// Метод Сортировки Пузырьком
    private static int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
// Записываем каждую итерацию в файл, форматируя строку
            logStep(Arrays.toString(mas)); 
        }
        return mas;
    }
// Метод который форматирует строку в нужный вид
    public static void logStep(String note){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
    
