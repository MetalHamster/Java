package syntax.interfaces.example;

public class UniversalSwitch implements Switchable {
    Switchable[] devices = new Switchable[5];
    int index=0;

    public void add(Switchable newDevice){
        devices[index]=newDevice;
        index++;
    }

    @Override
    public void on() {
        for (int i = 0; i < devices.length; i++) {
            if(devices[i] != null){
                devices[i].on();
            }
        }
    }

    @Override
    public void off() {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                devices[i].off();
            }
        }
    }

    //-----------------------Main Method-----------------------//
    public static void main(String[] args) {
        UniversalSwitch switch1= new UniversalSwitch();
        switch1.add(new Radio());
        switch1.add(new Lamp());
        switch1.add(new Monitor());
        switch1.on();
        switch1.off();
    }

}
