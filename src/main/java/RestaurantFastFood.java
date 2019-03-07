public class RestaurantFastFood {

    public RestaurantFastFood() {
        System.out.println("Hello in fast food");
    }

    public MealFastFood getMeal() {
        return new MealFastFood();
    }

    public DringFizzy getDring() {
        return new DringFizzy();
    }
}
