public class User implements StockObserver {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void onStockChange(String ingredient, int quantity) {
        System.out.println("Alert for " + username + ": Stock for '" + ingredient + "' is low. Remaining: " + quantity + " units.");
    }
}
