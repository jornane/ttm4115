package ttm4115.freetaxipool;

import java.util.ArrayList;
import java.util.List;

import ttm4115.taxi.Taxi;

import no.ntnu.item.arctis.runtime.Block;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Journey;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Route;

public class FreeTaxiPool extends Block {

	List<Taxi> taxis = new ArrayList<Taxi>();
	public java.lang.String destination;

	public void put(Taxi taxi) {
		taxis.add(taxi);
	}

	public Taxi getFirst(String position) {
		if (taxis.size() == 0)
			return null;
		return taxis.get(0);
	}

	public void remove(Taxi taxi) {
		taxis.remove(taxi);
	}

	public int count() {
		return taxis.size();
	}

	public Iterable<Taxi> getIterator() {
		return taxis;
	}

	public Journey createJourney(String destination, Taxi taxi) {
		return new Journey(taxi.location, destination, taxi.taxiId);
	}

	public Taxi routeToTaxi(Route route) {
		for(Taxi t : taxis)
			if (t.taxiId.equals(route.taxiId))
				return t;
		return null;
	}

}
