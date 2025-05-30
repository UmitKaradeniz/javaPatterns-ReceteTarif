public class MainCourseFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new MainCourse();
    }
}
