public class Main {
    public static void main(String[] args) {
        // Factory Method usage
        DishFactory dessertFactory = new DessertFactory();
        Dish dessert = dessertFactory.createDish();
        System.out.print("Dessert: ");
        dessert.prepare();

        DishFactory soupFactory = new SoupFactory();
        Dish soup = soupFactory.createDish();
        System.out.print("Soup: ");
        soup.prepare();

        DishFactory mainCourseFactory = new MainCourseFactory();
        Dish mainCourse = mainCourseFactory.createDish();
        System.out.print("Main Course: ");
        mainCourse.prepare();

        // Decorator usage
        Recipe basicRecipe = new BasicRecipe();
        Recipe decoratedRecipe1 = new VeganOptionDecorator(new NutritionInfoDecorator(basicRecipe));
        System.out.println("Recipe 1 (Vegan + Nutrition Info): " + decoratedRecipe1.getDetails());

        Recipe decoratedRecipe2 = new GlutenFreeDecorator(basicRecipe);
        System.out.println("Recipe 2 (Gluten-Free): " + decoratedRecipe2.getDetails());

        Recipe decoratedRecipe3 = new GlutenFreeDecorator(new VeganOptionDecorator(basicRecipe));
        System.out.println("Recipe 3 (Gluten-Free + Vegan): " + decoratedRecipe3.getDetails());

        Recipe allDecoratorsRecipe = new NutritionInfoDecorator(
            new GlutenFreeDecorator(new VeganOptionDecorator(new BasicRecipe()))
        );
        System.out.println("Recipe 4 (Vegan + Gluten-Free + Nutrition Info): " + allDecoratorsRecipe.getDetails());

        // Composite usage
        RecipeGroup dinnerSet = new RecipeGroup("Aksam Yemegi Menusu");
        dinnerSet.add(new RecipeItem("Mercimek Corbasi"));
        dinnerSet.add(new RecipeItem("Izgara Tavuk"));
        dinnerSet.add(new RecipeItem("Revani"));
        System.out.println("Orijinal Aksam Yemegi Menusu:");
        dinnerSet.print();

        RecipeGroup appetizers = new RecipeGroup("Baslangiclar");
        appetizers.add(new RecipeItem("Zeytinyagli Yaprak Sarma"));
        appetizers.add(new RecipeItem("Sarimsakli Ekmek"));

        RecipeGroup mainDishes = new RecipeGroup("Ana Yemekler");
        mainDishes.add(new RecipeItem("Etli Nohut"));
        mainDishes.add(new RecipeItem("Karniyarik"));

        RecipeGroup desserts = new RecipeGroup("Tatlilar");
        desserts.add(new RecipeItem("Sutlac"));
        desserts.add(new RecipeItem("Baklava"));

        RecipeGroup fullCourseMeal = new RecipeGroup("Tam Menu");
        fullCourseMeal.add(appetizers);
        fullCourseMeal.add(mainDishes);
        fullCourseMeal.add(desserts);
        fullCourseMeal.add(new RecipeItem("Cay veya Turk Kahvesi"));

        System.out.println("\nTam Menu:");
        fullCourseMeal.print();

        // Observer usage
        IngredientStockManager stockManager = new IngredientStockManager();
        StockObserver user1 = new User("Ece");
        StockObserver user2 = new User("Umit");

        stockManager.addObserver(user1);
        stockManager.addObserver(user2);
        System.out.println("Notifying Ece and Umit about the decrease in Olive Oil stock:");
        stockManager.notifyStockDecrease("Olive Oil", 2);

        StockObserver user3 = new User("Mehmet");
        stockManager.addObserver(user3);
        System.out.println("\nNotifying Ece, Umit, and Mehmet about the decrease in Flour stock:");
        stockManager.notifyStockDecrease("Flour", 5);
    }
}
