public abstract class RecipeDecorator implements Recipe {
    protected Recipe decoratedRecipe;

    public RecipeDecorator(Recipe recipe) {
        this.decoratedRecipe = recipe;
    }
}
