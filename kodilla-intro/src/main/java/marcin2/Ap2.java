package marcin2;

import marcin.Citizen;

public class Ap2 {
    public static void main(String[] args) {
        Citizen citizen=new Citizen(18,168,"Aldona");

        citizen.writeInfo();
        System.out.println(citizen.pesel);
    }
}
