package ttm4115.taxiclient;

import ttm4115.dispatcher.Request;
import no.ntnu.item.arctis.runtime.Block;

public class TaxiClient extends Block {

	public int taxiId;
	public ttm4115.taxi.Taxi taxi;
	public ttm4115.dispatcher.Request request;
	
	public static int getAlias(int i) {
		return i;
	}
	public static int getAlias(Request r) {
		return r.taxi.taxiId;
	}
	
	public String objectToString(Object o) {
		return o.toString();
	}

	public String numberToName(int num) {
		return "Taxi "+num;
	}

}
