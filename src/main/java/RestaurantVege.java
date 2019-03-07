public class RestaurantVege {

    public RestaurantVege() {
        System.out.println("Hello in restaurant vege");
    }

    public MealVege getMeal() {
        return new MealVege();
    }

    public DringVegetable getDring() {
        return new DringVegetable();
    }
}
