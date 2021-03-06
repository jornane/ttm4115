package ttm4115.taxi;

import com.bitreactive.library.mqtt.mqtt.MQTT;
import com.bitreactive.library.mqtt.mqtt.MQTT.Message;

import ttm4115.taxisystem.component.TaxiOrder;

import no.ntnu.item.arctis.runtime.Block;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Journey;

public class Taxi extends Block {

	int step = 0;
	public java.lang.String location;
	public java.lang.String taxiId;
	
	public static String getAlias(String taxiId) {
		return taxiId;
	}
	/**
	 * Return the taxi id for a certain Taxi.
	 * @return value of taxiId in Taxi
	 */
	public static String getAlias(TaxiOrder order) {
		System.out.println("Getting alias for taxi "+order.taxi);
		return getAlias(order.taxi);
	}
	/**
	 * 
	 * @param taxi
	 * @return
	 */
	public static String getAlias(Taxi taxi) {
		return taxi.taxiId;
	}
	
	public String toString() {
		return taxiId;
	}
	
	public void construct() {
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Taxi Simulator");
		setProperty(MQTT.P_MQTT_CLIENT_ID, "Taxi "+taxiId);
		setProperty(MQTT.P_MQTT_PORT, "1883");
		setProperty(MQTT.P_MQTT_SERVER, "broker.mqttdashboard.com");
		setProperty(MQTT.P_MQTT_TOPIC_PUBLISH, "generic-map-ui-group05");
		setProperty(MQTT.P_MQTT_TOPIC_SUBSCRIBE, "generic-map-ui-group05");
	}

	public static Message stringToMessage(String string) {
		return new Message(string.getBytes());
	}

	public Journey createJourney(String start, String destination) {
		//if (start == null)
			//throw new NullPointerException("start");
		if (destination == null)
			throw new NullPointerException("destination");
		System.out.println("Creating a route from "+location+" to "+destination);
		return new Journey(location, destination, ""+taxiId);
	}

	public String extractOrder(TaxiOrder order) {
		System.out.println("Extracting position from order: "+order.position+" (traveling from "+location+")");
		return order.position;
	}
	
	public Taxi self() {
		return this;
	}

}
