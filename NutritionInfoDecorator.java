public class NutritionInfoDecorator extends RecipeDecorator {
    public NutritionInfoDecorator(Recipe recipe) {
        super(recipe);
    }
    @Override
    public String getDetails() {
        return decoratedRecipe.getDetails() + " | Calories: 250 kcal | Protein: 10g";
    }
}
