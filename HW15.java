import java.util.Deque;
import java.util.LinkedList;

/**
 * HW15 История посещения веб-сайтов
Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
Используйте Deque для хранения истории.
● visitSite(String site): Добавляет сайт в историю посещений.
● back(int steps): Возвращает название сайта, который был посещен
steps назад, или null, если таких шагов нет.
● getHistory(): Возвращает список сайтов в истории посещений, от
последнего посещенного к первому
 */
public class HW15 {

    public static void main(String[] args) {
        Deque<String> siteList = new LinkedList<>();
        siteList.offerFirst("yandex.ru");
        siteList.offerFirst("github.com");
        siteList.offerFirst("google.com");
        HW15 res = new HW15();
        System.out.println(siteList); // [google.com, github.com, yandex.ru]
        System.out.println(res.add(siteList));// [vk.ru, google.com, github.com, yandex.ru]
        System.out.println(res.back(siteList)); // github.com
        System.out.println(res.history(siteList)); // [vk.ru, google.com, github.com, yandex.ru]
    }
    public Deque<String> add(Deque<String> siteList){
        siteList.offerFirst("vk.ru"); // добавляет сайт в начало очереди(истории)
        return siteList;
    }

    public String back(Deque<String> siteList){
/**Для возвращения к сайту, который был посещен steps назад, используйте метод
stream вместе с skip и findFirst из Deque. Метод stream создаст поток элементов
из очереди, skip пропустит первые steps элементов, а findFirst вернет первый
оставшийся элемент или null, если шагов больше, чем элементов в очереди */
        int steps = 2;
        if (steps >= siteList.size()) {
            return null;
        }
        return siteList.stream().skip(steps).findFirst().orElse(null);
    }

    public Deque<String> history(Deque<String> siteList){ // История от Последнего посещения к первому
        return siteList;
    }
}
