public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.year = 2020;
        notebook.checkWeight();
        Notebook heavyNotebook = new Notebook(2000, 1500);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
    }


    public void nowa() {
        System.out.println("jestem w metodzie nowa");
    }
}