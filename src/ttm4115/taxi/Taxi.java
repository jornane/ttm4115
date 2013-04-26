package ttm4115.taxi;

import com.bitreactive.library.android.maps.model.Position;
import com.bitreactive.library.mqtt.mqtt.MQTT;
import com.bitreactive.library.mqtt.mqtt.MQTT.Message;

import no.ntnu.item.arctis.runtime.Block;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Journey;

public class Taxi extends Block {

	int step = 0;
	int taxiId;
	public com.bitreactive.library.android.maps.model.Position location;
	public com.bitreactive.library.android.maps.model.Position destination;
	public static String getAlias(int taxiId) {
		return "Taxi "+taxiId;
	}

	public void construct(int taxiId) {
		this.taxiId = taxiId;
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Taxi Simulator");
		setProperty(MQTT.P_MQTT_CLIENT_ID, getAlias(taxiId));
		setProperty(MQTT.P_MQTT_PORT, "1883");
		setProperty(MQTT.P_MQTT_SERVER, "broker.mqttdashboard.com");
		setProperty(MQTT.P_MQTT_TOPIC_PUBLISH, "generic-map-ui-group05");
		setProperty(MQTT.P_MQTT_TOPIC_SUBSCRIBE, "generic-map-ui-group05");
	}

	public Message stringToMessage(String string) {
		System.out.println(string);
		return new Message(string.getBytes());
	}

	public Journey createJourney(Position destination) {
		return new Journey(
				location.getLatitude()+","+location.getLongitude(),
				destination.getLatitude()+","+destination.getLongitude(),
				getAlias(taxiId)
			);
	}

}
