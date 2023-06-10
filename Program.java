
    /**
     * Домашняя работа, задача:
     * ========================
     * 
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую
     * перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */

public class Program {

    public static void main(String[] args) {
        Box<Orange> boxOrange1 = new Box<>("номер 1 с апельсинами");
        Box<Orange> boxOrange2 = new Box<>("номер 2 с апельсинами");

        Box<Apple> boxApple3 = new Box<>("номер 3 с яблоками");
        Box<Apple> boxApple4 = new Box<>("номер 4 с яблоками");

        int number = 15;
        for (int i = 0; i < number; i++) { // положим во все коробки по 15 фруктов
            boxOrange1.addFruits(new Orange());
            boxOrange2.addFruits(new Orange());
            boxApple3.addFruits(new Apple());
            boxApple4.addFruits(new Apple());
            // boxOrange1.addFruits(new Apple()); - невозможно положить яблоки в апельсиновую коробку
            // boxApple3.addFruits(new Orange()); - невозможно положить апельсины в яблочную коробку
        }

        System.out.println(boxOrange1);
        System.out.println(boxOrange2);
        System.out.println(boxApple3);
        System.out.println(boxApple4);

        System.out.print("\nСравним, одинаковы ли по весу Коробка 3(яблоки) и Коробка 2(апельсины)  -  ");
        System.out.println(boxApple3.compare(boxOrange2));
        System.out.println("\nПереложим все яблоки в одну коробку и все апельсины в другую коробку.  \n");
        boxApple3.transfer(boxApple4);
        boxOrange1.transfer(boxOrange2);
        System.out.println("Теперь:   ");
        System.out.println(boxOrange1);
        System.out.println(boxOrange2);
        System.out.println(boxApple3);
        System.out.println(boxApple4);
    }
}
