package ttm4115.freetaxipool;

import java.util.ArrayList;

import ttm4115.taxi.Taxi;
import ttm4115.taxidispatch.Request;
import ttm4115.userclient.UserOrder;

import no.ntnu.item.arctis.runtime.Block;

public class FreeTaxiPool extends Block {

	ArrayList<Taxi> taxis = new ArrayList<Taxi>();

	public void put(Taxi taxi) {
		taxis.add(taxi);
	}

	public Request getNearest(UserOrder position) {
		if (taxis.size() == 0)
			return null;
		return new Request(position, taxis.get(0));
	}

	public void remove(Taxi taxi) {
		taxis.remove(taxi);
	}

	public int count() {
		return taxis.size();
	}

}
