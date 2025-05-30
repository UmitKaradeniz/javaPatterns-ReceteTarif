public class SoupFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Soup();
    }
}
