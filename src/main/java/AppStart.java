public class AppStart {

    public static void main(String[] args) {
        RestaurantFastFood restaurantFastFood = new RestaurantFastFood();
        restaurantFastFood.getDring().servesDrink();
        restaurantFastFood.getMeal().servesMeal();

        RestaurantVege restaurantVege = new RestaurantVege();
        restaurantVege.getDring().servesDrink();
        restaurantVege.getMeal().servesMeal();
    }
}
