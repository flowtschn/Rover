
public interface Sensor<T> {
    void read(boolean status);

    void enabled(boolean status);

    void disabled(boolean status);
}




