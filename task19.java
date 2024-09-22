import java.util.*;

/**
 * task19 1) Напишите метод, который заполнит массив из 100 элементов
 * случайными цифрами от 0 до 24.
 * 2) Создайте метод, в который передайте заполненный выше массив и с 
 * помощью Set вычислите % уникальных значений в данном массиве и верните
 * его в виде числа с плавающей запятой.
 * 3) Для вычисления % используйте формулу:
 *  Кол-во уникальных чисел * 100 / общее кол-во чисел в массиве.
 */
public class task19 {

    public static void main(String[] args) {
        task19 res = new task19();
        int[] array = res.initArray();
        System.out.println(Arrays.toString(array)); // печатаем случайный массив
        System.out.println(res.getPercentUniqueValues(array)); // печатаем %
    }
// 1) Метод который заполняет массив из 100 эл-тов случ.цифрами от 0 до 24
    public int[] initArray(){
        int[] array = new int[100]; // создаем массив размера 100
        Random random = new Random();// для создания случайных значений обьявляем класс Random
                                    // и вызываем соотв. конструктор
        for (int i = 0; i < 100; i++) { // запускаем цикл в количестве i<100
            array[i] = random.nextInt(24); // заполняем каждый элемент массива случайным значением от 0 до 24
        }
        return array;
    }
// 2) Вычисление % по указанной формуле
    public float getPercentUniqueValues(int[] array){
        Set<Integer> set = new HashSet<>(); // set будет хранить в себе уникальные значения входного массива
        for (int num : array) { // проходим по массиву
            set.add(num); // работает правило Уникальности значений Set
// автоматически будет проверяться наличие элемента в Set, если нет то долбален, если уже есть, то не добавится
        }
        System.out.println(set.toString()); // печатаем наш set
        float result = set.size() * (100 / array.length); // вычисляем %
        return result;
    }
}