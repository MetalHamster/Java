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
package mqtt.observer;

import org.eclipse.paho.client.mqttv3.*;

public class MqttCommObserver implements MqttCallback, Observer {
    protected String broker, cliendId, topic;
    protected MqttClient mqttClient;

    public MqttCommObserver(String broker, String cliendId, String topic) throws MqttException {
        this.topic = topic;
        mqttClient=new MqttClient(broker,cliendId);
        mqttClient.setCallback(this);
        mqttClient.connect();
    }

    public void publishMqtt(String topic,String message) throws MqttException {
        mqttClient.publish(topic, message.getBytes(), 0, false);
    }

    public void subscribeMqtt(String topic) {
        try {
            mqttClient.subscribe(topic);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void connectionLost(Throwable throwable) {
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) {
        System.out.println(mqttMessage);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

    @Override
    public void update(int value) {
        try {
            publishMqtt(topic, String.valueOf(value));
        } catch (MqttException e) {
            e.printStackTrace();
        }

    }
}