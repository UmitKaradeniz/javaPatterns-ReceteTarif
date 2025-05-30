public class RecipeItem implements RecipeComponent {
    private final String name;

    public RecipeItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("- " + name);
    }
}
