public interface StockSubject {
    void addObserver(StockObserver observer);
    void notifyStockDecrease(String ingredient, int quantity);
}
