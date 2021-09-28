public class CustomObject implements Drivable, Domesticatable, Tradable{

    private int speed;
    private int maxSpeedSoFar;
    private String sound;

    /**
     * Creates a CustomObject instance
     * @param speed The speed of this CustomObject
     * @param sound The string representing the sound of this CustomObject
     */
    public CustomObject(int speed, String sound){
        this.speed = speed;
        this.maxSpeedSoFar = speed;
        this.sound = sound;
    }
    /**
     * increase the speed of the CustomObject by 1
     */
    @Override
    public void upgradeSpeed(){
        if (this.speed < 10) {
            this.speed++;
            if (this.speed > this.maxSpeedSoFar){
                this.maxSpeedSoFar = this.speed;
            }
        } else {
            System.out.println("Can't upgrade speed more.");
        }
    }

    /**
     * slow the speed of the CustomObject by 1
     */
    @Override
    public void downgradeSpeed(){
        if (this.speed > 0) {
            this.speed--;
        } else {
            System.out.println("Can't lower speed more.");
        }
    }

    /**
     * Get the maximum speed that this CustomObject has reached
     * @return idk, return something
     */
    @Override
    public int getMaxSpeed(){
        return this.maxSpeedSoFar;
    }

    /**
     * Get the current speed of the CustomObject
     * @return return an int representing the current speed of this instance
     */
    public int getSpeed(){ return this.speed; }

    /**
     * Get the sound of the  CustomObject
     * @return return a String representing the sound of this instance
     */
    @Override
    public String sound() {
        return this.sound + "!!";

    }

    /**
     * Get the price of the CustomObject
     * @return return and int == 50 as the price of any CustomObject of this instance
     */
    @Override
    public int getPrice(){
        return 50;
    }
}
