package ttm4115.taxi;

import java.util.UUID;

import com.bitreactive.library.android.maps.model.MapUpdate;
import com.bitreactive.library.android.maps.model.Marker;
import com.bitreactive.library.android.maps.model.Position;
import com.bitreactive.library.mqtt.mqtt.MQTT;
import com.bitreactive.library.mqtt.mqtt.MQTT.Message;

import no.ntnu.item.arctis.runtime.Block;

public class Taxi extends Block {

	public void configureMQTT() {
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Taxi Simulator");
		setProperty(MQTT.P_MQTT_CLIENT_ID, UUID.randomUUID().toString().substring(0, 20));
		setProperty(MQTT.P_MQTT_PORT, "1883");
		setProperty(MQTT.P_MQTT_SERVER, "broker.mqttdashboard.com");
		setProperty(MQTT.P_MQTT_TOPIC_PUBLISH, "generic-map-ui-group05");
		setProperty(MQTT.P_MQTT_TOPIC_SUBSCRIBE, "generic-map-ui-group05");
	}

	public MapUpdate randomMapUpdate() {
		MapUpdate update = new MapUpdate();
		Marker marker = Marker.createMarker("taxi1");
		marker.position(new Position(0,0));
		update.addMarker(marker);
		
		marker = Marker.createMarker("taxi2");
		marker.position(new Position(-10,0));
		update.addMarker(marker);
		
		marker = Marker.createMarker("taxi3");
		marker.position(new Position(0,-10));
		update.addMarker(marker);
		
		marker = Marker.createMarker("taxi4");
		marker.position(new Position(-10,-10));
		update.addMarker(marker);
		return update;
	}

	public Message stringToMessage(String string) {
		return new Message(string.getBytes());
	}

}
