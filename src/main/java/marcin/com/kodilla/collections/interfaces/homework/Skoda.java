package marcin.com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {
    private int speed = 90;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 60;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
