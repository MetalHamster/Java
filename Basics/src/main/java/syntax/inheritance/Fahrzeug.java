package syntax.inheritance;

public class Fahrzeug {
    protected int speed;

    public Fahrzeug(int speed){
        this.speed = speed;
    }

    public void drive(){
        System.out.println("Fahrzeug");
    }

}
