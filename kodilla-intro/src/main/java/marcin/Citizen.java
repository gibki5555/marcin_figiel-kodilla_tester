package marcin;

public class Citizen extends Person {
   public String pesel;

    public void writeInfo() {
        System.out.println(this.pesel +"," +this.age +","+ this.name +","+ this.height);
    }

    public Citizen(double age, double height, String name) {
        super(age, height, name);

    }

    public static void main(String[] args) {
        Citizen c=new Citizen(18, 175,"Wiktor");
        c.pesel= "85082401655";
        c.writeInfo();
        System.out.println(c.age);
        System.out.println(c.weight);
    }
}
