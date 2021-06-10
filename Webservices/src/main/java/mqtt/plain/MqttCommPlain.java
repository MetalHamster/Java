/*package reference.datacommunication.mqtt;


import org.eclipse.paho.client.mqttv3.*;

public class MqttComm implements MqttCallback {
        String broker = "212.101.19.103:1883";
        String clientId = "HFTMSample";
        MqttClient mqttClient;

        mqttClient = new MqttClient(broker, clientId);

        mqttClient.connect();

        //send hello to topic hftm with QoS 0 and no retain
        mqttClient.publish("hftm/dice", "hello".getBytes(), 0, false);

        //receive part in a class implementing MqttCallback
        mqttClient.setCallback(this);
        mqttClient.subscribe("hftm/dice");

        @Override
        public void connectionLost(Throwable throwable) {

        }



        @Override
        public void messageArrived(String topic, MqttMessage mm){
            System.out.println(topic + ":" + mm.toString());
        }

        @Override
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

        }
}
*/
package mqtt.plain;

import org.eclipse.paho.client.mqttv3.*;

public class MqttCommPlain implements MqttCallback {
    protected String broker, cliendId;
    protected MqttClient mqttClient;

    public MqttCommPlain(String broker, String cliendId) throws MqttException {
        mqttClient=new MqttClient(broker,cliendId);
        mqttClient.setCallback(this);
        mqttClient.connect();
    }

    public void publishMqtt(String topic,String message) throws MqttException {
        mqttClient.publish(topic, message.getBytes(), 0, false);
    }

    public void publishMqtt(String topic,String message,int qos) throws MqttException {
        mqttClient.publish(topic, message.getBytes(), 0, false);
    }

    public void subscribeMqtt(String topic) throws MqttException {
        mqttClient.subscribe(topic);
    }

    @Override
    public void connectionLost(Throwable throwable) {
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        System.out.println(mqttMessage);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

}