
public abstract class AbstractSensor implements Sensor {
    static boolean status;



    @Override
    public  void read(boolean status) {
        if (this.status == false) {

            System.out.println("Sensor ist nicht angeschalten!");
        }

    }

    @Override
    public void enabled(boolean status) {
        this.status = true;

    }

    @Override
    public void disabled(boolean status) {
        this.status = false;
    }

}
