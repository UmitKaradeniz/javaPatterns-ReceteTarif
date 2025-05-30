import java.util.ArrayList;
import java.util.List;

public class RecipeGroup implements RecipeComponent {
    private final String groupName;
    private final List<RecipeComponent> components = new ArrayList<>();

    public RecipeGroup(String groupName) {
        this.groupName = groupName;
    }

    public void add(RecipeComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("== " + groupName + " ==");
        for (RecipeComponent component : components) {
            component.print();
        }
    }
}
