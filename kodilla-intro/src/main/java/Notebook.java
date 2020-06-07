public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1600) {
            System.out.println("The price is good");
        } else
            System.out.println("This notebook is expensive");
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("urządzenie jest lekkie"); /*TODO: kdrzazga - pls translate to English*/
        } else if (this.weight >= 600 && this.weight <= 1000) {//dodać inne wartości i inne komunikaty
            System.out.println("urządzenie jest niezbyt ciężkie");
        } else
            System.out.println("To urządzenie jest bardzo ciężkie");
    }

    public void checkYearAndPrice() { /*TODO: Review kdrzazga method not used - pls use it in FirstClass*/
        if (this.price > 1500 && this.year > 2018) {
            System.out.println("Nowy i drogi.");
        } else if (this.price >= 600 && this.year <= 1000) {
            System.out.println("Bla bla");
        } else
            System.out.println("Nic");
    }
}