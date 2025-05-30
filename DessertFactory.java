public class DessertFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Dessert();
    }
}
