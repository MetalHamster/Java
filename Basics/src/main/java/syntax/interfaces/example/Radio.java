package syntax.interfaces.example;

public class Radio implements Switchable {


    @Override
    public void on() {
        System.out.println("Radio: On");
    }

    @Override
    public void off() {
        System.out.println("Radio: Off");
    }
}
