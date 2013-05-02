package ttm4115.taxiclient;

import ttm4115.dispatcher.Request;
import no.ntnu.item.arctis.runtime.Block;

public class TaxiClient extends Block {

	public int taxiId;
	public ttm4115.taxi.Taxi taxi;
	public ttm4115.dispatcher.Request request;
	
	public static String getAlias(int i) {
		return "Taxi "+i;
	}
	public static String getAlias(Request r) {
		return "Taxi "+r.taxi.taxiId;
	}
	
	public String objectToString(Object o) {
		return o.toString();
	}

	public String numberToName(int num) {
		return "Taxi "+num;
	}
	public int nameToNumber(String name) {
		for(int i=0;i<name.length();i++) try {
			return Integer.parseInt(name.substring(i));
		} catch (Exception e) {
		}
		return -1;
	}

}
