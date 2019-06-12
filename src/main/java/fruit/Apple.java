package fruit;

public class Apple extends fruit.Fruit implements edible.Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
