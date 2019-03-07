public class MealVege {

    String name = "MealVege";

    public MealVege servesMeal() {
        System.out.println(name);
        return new MealVege();
    }
}
