package marcin;

public class Person {
    String name;
    double age;
    double height;
    protected int weight;

    public Person(double age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;

    }

    public void checkAgeAndHeight() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
