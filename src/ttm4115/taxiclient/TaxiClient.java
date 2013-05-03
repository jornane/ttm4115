package ttm4115.taxiclient;

import ttm4115.dispatcher.Request;
import ttm4115.taxi.Taxi;
import no.ntnu.item.arctis.runtime.Block;

public class TaxiClient extends Block {

	public ttm4115.taxi.Taxi taxi;
	public ttm4115.dispatcher.Request request;
	public java.lang.String taxiId;
	
	public static String getAlias(Request r) {
		return getAlias(r.taxi);
	}
	public static String getAlias(String s) {
		return s;
	}
	public static String getAlias(Taxi t) {
		return t.taxiId;
	}
	
	public String objectToString(Object o) {
		return o.toString();
	}

	public String numberToName(int num) {
		return "Taxi "+num;
	}

}
