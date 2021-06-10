package syntax.interfaces.example;

public class Monitor implements Switchable {

    @Override
    public void on() {
        System.out.println("Monitor: On");
    }

    @Override
    public void off() {
        System.out.println("Monitor: Off");
    }
}
