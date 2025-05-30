public class VeganOptionDecorator extends RecipeDecorator {
    public VeganOptionDecorator(Recipe recipe) {
        super(recipe);
    }
    
    @Override
    public String getDetails() {
        return decoratedRecipe.getDetails() + " | Vegan Option: Available";
    }
}
