package sensores.sensores;

import java.io.DataOutputStream;
import java.net.Socket;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class SimpleMqttCallBack implements MqttCallback{
	Socket socket;
	DataOutputStream sensor_signal;
	String signal;
	public void connectionLost(Throwable cause) {
		System.out.println("Conexión con MQTT perdida...");
	}

	public void messageArrived(String topic, MqttMessage message) throws Exception {
		socket = new Socket("127.0.0.5", 5000);
		sensor_signal = new DataOutputStream(socket.getOutputStream());
		signal = message.toString();
		sensor_signal.writeUTF(signal);
		System.out.println("Mensaje recibido:\n\t" + message);
	}

	public void deliveryComplete(IMqttDeliveryToken token) {
		//NO SE UTILIZA
	}
}
