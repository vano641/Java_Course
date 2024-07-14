/**
 * HW6: Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
 * реализует алгоритм сортировки слиянием. 
 * Метод должен возвращать отсортированный массив.
 * a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
public class HW6 {

    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4, 10, -1, -5}; // Исходный массив
        int[] res = mergeSort(a);
        for (int i : res) {System.out.printf("%d",i);
        }
    }
    public static int[] mergeSort(int[] a) {
        int n = a.length; // определяем длинну входного массива
// Условия выходя из Рекурсии. Т.к нам нужно разбить входной массив на Массивы размером 1 элемент.
        if (n < 2) {
            return a;
        }

        int mid = n / 2; // Введем размер Середины входного массива
        int[] l = new int[mid]; // Левый массив (в нем элементы от a[0] до a[mid])
        int[] r = new int[n - mid]; // Правый массив (в нем остальные элементы)
// Если изначально количество элементов Не Четное, то в Левом будет Четное кол-во, а в Правом Не Четное 

        for (int i = 0; i < mid; i++) {
            l[i] = a[i]; // Заполняем Левый массив
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i]; // Заполняем Правый массив
        }
// Полученные массивы закидываем обратно в Рекурсию, пока длинна каждого массива не будет равно 1
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r); // Передаем полученные пары в метод Слияния
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length; 
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++]; // Сокращенный вариант записи
            }
            else {
                a[k] = r[j]; // Обычная запись: В начале присваиваем значение на нужную позицию
                k++; // Затем увеличиваем индексы (Сдвигаем место в массиве)
                j++;
            }
        }
// В случае когда Например Правый массив дошел до конца и мы сохранили все его элементы,
// а вот Левый массив Не дошел до конца и в нем еще остались элементы, но while остановился(по условию)
// Нужно добавить оствшиеся элементы в конец
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }
   
}