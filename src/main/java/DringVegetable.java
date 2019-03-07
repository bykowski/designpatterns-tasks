public class DringVegetable {

    String name = "DringVege";

    public DringVegetable servesDrink() {
        System.out.println(name);
        return new DringVegetable();
    }
}
