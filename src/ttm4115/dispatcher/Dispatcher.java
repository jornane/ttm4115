package ttm4115.dispatcher;

import ttm4115.taxi.Taxi;
import ttm4115.taxisystem.component.TaxiOrder;
import ttm4115.userclient.UserOrder;
import no.ntnu.item.arctis.runtime.Block;

public class Dispatcher extends Block {

	public boolean taxisAvailable;
	public ttm4115.userclient.UserOrder activeOrder;
	public ttm4115.taxisystem.component.TaxiOrder positioner;

	public Request createRequest(UserOrder uo, Taxi t) {
		// return new Request(uo, t); // Cannot use this due to ReactiveBlocks bug
		return new Request(activeOrder, t);
	}

	public Taxi request2taxi(Request request) {
		System.out.println("Converting request to taxi; "+request.toString());
		return request.taxi;
	}

	public UserOrder request2order(Request request) {
		System.out.println("Converting request to order; "+request.toString());
		return request.userOrder;
	}

	public String order2location(UserOrder uo) {
		System.out.println("Converting order to location; "+uo.destination+", user "+uo.userClient.name);
		return uo.toString();
	}

	public boolean largerThanZero(int i) {
		return i > 0;
	}

	public TaxiOrder request2taxiOrder(Request request) {
		System.out.println("Converting request to taxi order");
		return new TaxiOrder(request.taxi, request.userOrder.destination);
	}
	
	public TaxiOrder getGl¿shaugenOrder(Taxi t) {
		return new TaxiOrder(t, "Gl¿shaugen, Trondheim, Norway");
	}
	
}
