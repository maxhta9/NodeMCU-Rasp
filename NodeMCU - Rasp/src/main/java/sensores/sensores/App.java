package sensores.sensores;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class App 
{
    public static void main( String[] args ) throws MqttException {
    	Subscriber.main(args);
    	System.out.println("SE CONECTO");
    }
}
