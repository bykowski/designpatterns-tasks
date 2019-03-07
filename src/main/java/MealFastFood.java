public class MealFastFood {

    String name = "MealFastFood";

    public MealFastFood servesMeal() {
        System.out.println(name);
        return new MealFastFood();
    }
}
