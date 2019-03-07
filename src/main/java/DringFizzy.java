public class DringFizzy {

    String name = "DringFizzy";

    public DringFizzy servesDrink() {
        System.out.println(name);
        return new DringFizzy();
    }
}
