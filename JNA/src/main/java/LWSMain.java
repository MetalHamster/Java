import tools.MonitorTools;

public class LWSMain {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            //System.out.println(MonitorTools.getMousePoint());
            if(MonitorTools.getMousePoint().x == 0 && MonitorTools.getMousePoint().y == 0){
                Thread.sleep(3000);
                System.out.println("locked");
                //LWS.LockWorkStation();
            }
        }
    }
}
