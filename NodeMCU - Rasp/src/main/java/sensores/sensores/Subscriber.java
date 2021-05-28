package sensores.sensores;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Subscriber {
	private static String BROKER = "tcp://192.168.1.110:1883";
	
	  public static void main(String[] args) throws MqttException {
		  
	    MqttClient client=new MqttClient(BROKER, MqttClient.generateClientId());
	    client.setCallback( new SimpleMqttCallBack() );
	    client.connect();
	    client.subscribe("PUERTA");
	  }
}