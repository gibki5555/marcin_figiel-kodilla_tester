package marcin.com.kodilla.collections.interfaces.homework;

public class Honda implements Car{
    private int speed = 50;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 30;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
