package syntax.interfaces.example;

public class Lamp implements Switchable {

    @Override
    public void on() {
        System.out.println("Lamp: On");
    }

    @Override
    public void off() {
        System.out.println("Lamp: Off");
    }
}
