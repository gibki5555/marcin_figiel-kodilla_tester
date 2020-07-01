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
            System.out.println("its light");
        } else if (this.weight >= 600 && this.weight <= 1000) {
            System.out.println("its hight");
        } else
            System.out.println("its very hight");
    }

    public void checkYearAndPrice() {
        if (this.price > 1500 && this.year > 2018) {
            System.out.println("New and expensive.");
        } else if (this.price >= 600 && this.year <= 1000) {
            System.out.println("Bla bla");
        } else
            System.out.println("Nothing");
    }
}