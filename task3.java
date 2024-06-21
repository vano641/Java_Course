/**
 * task3: Дан массив двоичных чисел, например [1,1,0,1,1,1]
 * Вывести макисмальное количество подряд идущих 1
 */
public class task3 {

    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,0,0};

        int counter = 0; // счетчик подряд идущих 1
        int max = 0; // максимальная последовательность 1
        for (int i : array) {
            if (i == 1) {
                counter++;
            }
            if (i == 0) { // если i==0 и приэтом counter != 0, то нужно сравнить max и counter
                if (counter != 0) {
                    if (max < counter) {
                        max = counter;
                    }
                    counter = 0; // обнуляем счетчик
                }
            }
        }
        if (counter != 0) { // после прохода по массиву сравниваем max и counter
            if (max < counter) {
                max = counter;
            }
        }
        System.out.println(max);
    }
}
