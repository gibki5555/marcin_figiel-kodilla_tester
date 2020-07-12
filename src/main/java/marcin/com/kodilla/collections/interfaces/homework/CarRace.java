package marcin.com.kodilla.collections.interfaces.homework;

public class CarRace  {
    public static void main(String[] args) {
        Car ford= new Ford();
        Car honda= new Honda();
        Car skoda= new Skoda();
        doRace (ford);
        doRace (skoda);
        doRace (honda);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

}
