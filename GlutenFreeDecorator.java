public class GlutenFreeDecorator extends RecipeDecorator {
    public GlutenFreeDecorator(Recipe recipe) {
        super(recipe);
    }

    @Override
    public String getDetails() {
        return decoratedRecipe.getDetails() + " | Gluten-Free: Yes";
    }
}
