public class Car implements Drivable, Tradable {

    private final int price;
    private final int basic_speed;
    private int max_speed;


    public Car (int basic_speed, int max_speed, int price) {
        this.basic_speed = basic_speed;
        this.max_speed = max_speed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.max_speed += 1;
    }

    @Override
    public void downgradeSpeed() {
        this.max_speed += 1;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
