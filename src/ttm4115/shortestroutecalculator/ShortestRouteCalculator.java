package ttm4115.shortestroutecalculator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import no.ntnu.item.arctis.runtime.Block;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Leg;
import no.ntnu.item.ttm4115.library.routeplanner.routeplanner.Route;

public class ShortestRouteCalculator extends Block {

	SortedSet<Route> routes = new TreeSet<Route>(new Comparator<Route>(){
		@Override
		public int compare(Route r0, Route r1) {
			int steps0 = 0, steps1 = 0;
			for(Leg l : r0.legs)
				steps0 += l.steps.size();
			for(Leg l : r1.legs)
				steps1 += l.steps.size();
			return steps0 - steps1;
		}});

	public void addRoute(Route r) {
		routes.add(r);
	}

	public Route getShortestRoute() {
		return routes.first();
	}

}
