package mqtt.observer;

import org.eclipse.paho.client.mqttv3.MqttException;
/**
 * @author Matthias.Flueckiger
 */
public class DiceMqtt {
    public static void main(String[] args) throws MqttException {
        DiceModelObsScheduler dice = new DiceModelObsScheduler();
        Observer mqtt = new MqttCommObserver("tcp://test.mosquitto.org:1883","9145afbed91c42e9b42994a3a7a711fd","newDice");

        dice.addSubscriber(mqtt);

    }
}
