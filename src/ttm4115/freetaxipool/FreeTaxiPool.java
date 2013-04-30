package ttm4115.freetaxipool;

import java.util.ArrayList;

import ttm4115.taxi.Taxi;

import no.ntnu.item.arctis.runtime.Block;

public class FreeTaxiPool extends Block {

	ArrayList<Taxi> taxis = new ArrayList<Taxi>();

	public void put(Taxi taxi) {
		taxis.add(taxi);
	}

	public Taxi getNearest() {
		if (taxis.size() == 0)
			return null;
		return taxis.get(0);
	}

	public void remove(Taxi taxi) {
		taxis.remove(taxi);
	}

}
