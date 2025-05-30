import java.util.ArrayList;
import java.util.List;

public class IngredientStockManager implements StockSubject {
    private final List<StockObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyStockDecrease(String ingredient, int quantity) {
        for (StockObserver observer : observers) {
            observer.onStockChange(ingredient, quantity);
        }
    }
}
