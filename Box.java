import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruits;
    private String name;

    public Box(String name) {
        this.fruits = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<F> getArray() {
        return fruits;
    }

    public String getName() {
        return name;
    }

    public void addFruits(F fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        } else {
            return 0.0f;
        }
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super F> box) {
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

    @Override
    public String toString() {
        return String.format("В коробке %s лежат %d фруктов. Вес этой коробки %.1f", name, fruits.size(), getWeight());
    }
}
