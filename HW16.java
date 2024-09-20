import java.util.*;

/**
 * HW16  Подсчет продуктов в корзине
Создайте программу для учета продуктов в корзине. Программа должна
позволять добавлять, удалять, обновлять количество продуктов, а также
проверять наличие продуктов в корзине. Используйте HashMap для хранения
продуктов и их количества.
 */
public class HW16 {

    public static void main(String[] args) {
        HashMap<String, Integer> ShoppingBasket = new HashMap<>();
        ShoppingBasket.put("apple", 3);
        ShoppingBasket.put("banana", 2);
        ShoppingBasket.put("orange", 1);
        System.out.println(ShoppingBasket);
        
        HW16 res = new HW16();
        System.out.println(res.add(ShoppingBasket));
        System.out.println(res.remove(ShoppingBasket));
        System.out.println(res.update(ShoppingBasket));
        System.out.println(res.check(ShoppingBasket));
// Метод показывающий содержимое корзины        
        if (ShoppingBasket.isEmpty()) {
            System.out.println("Корзина Пуста");
        } else {
//Используйте метод entrySet класса HashMap, чтобы получить набор пар
//ключ-значение, и затем пройдитесь по нему в цикле
            for (HashMap.Entry<String, Integer> i : ShoppingBasket.entrySet()) {
                System.out.println(i.getKey() + "-" + i.getValue()); // banana-5 
                                                                     // apple-9 итд
            }
        }
    }
    public HashMap<String, Integer> add(HashMap<String, Integer> ShoppingBasket){
        String product = "apple";
        Integer quantity = 6;
        if (ShoppingBasket.containsKey(product)) { // если в корзине есть данный ключ
            ShoppingBasket.put(product, ShoppingBasket.get(product) + quantity); // к значению в Корзине + Значение введенное
        } else {
            ShoppingBasket.put(product, quantity); // если Ключа нет в корзине, то добавляем его
        }
        return ShoppingBasket;
    }
    public HashMap<String, Integer> remove(HashMap<String, Integer> ShoppingBasket){
        String product = "orange";
        if (ShoppingBasket.containsKey(product)) { // Если Ключ есть в корзине
            ShoppingBasket.remove(product); // удалить этот ключ
        }
        return ShoppingBasket;
    }
    public HashMap<String, Integer> update(HashMap<String, Integer> ShoppingBasket){
        String product = "banana";
        Integer quantity = 5;
        if (ShoppingBasket.containsKey(product)) {// Если Ключ есть в карзине, то его значение обновится на Указанное
            ShoppingBasket.put(product, quantity); // Если Ключа нет, то ничего не поменяется
        }
        return ShoppingBasket;
    }
    public Integer check(HashMap<String, Integer> ShoppingBasket){
        String product = "apple"; // возвращает значение по ключу (количество продукта в корзине)
        return ShoppingBasket.getOrDefault(product, 0);
    }

}
