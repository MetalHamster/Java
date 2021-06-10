package mqtt.plain;

import org.eclipse.paho.client.mqttv3.MqttException;

public class BasicMqtt {
    public static void main(String[] args) throws MqttException {

        MqttCommPlain a = new MqttCommPlain("tcp://test.mosquitto.org:1883","9845afbed91c42e9b42994a3a7a711fd");
        a.subscribeMqtt("hftm/dice");
        //a.publishMqtt("music","metal");

        /*
        MqttCommPlain mqttCommPlain = new MqttCommPlain("tcp://212.101.19.103:1883","9845a2bed91c42e9b42994a3a7a711fd");
        mqttCommPlain.publishMqtt("led/x/color","rgb(20,200,0)");
        */

    }
}
