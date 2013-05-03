package ttm4115.dispatcher;

import ttm4115.taxi.Taxi;
import ttm4115.taxisystem.component.TaxiOrder;
import ttm4115.userclient.UserOrder;
import no.ntnu.item.arctis.runtime.Block;

public class Dispatcher extends Block {

	public boolean taxisAvailable;
	public ttm4115.userclient.UserOrder activeOrder;

	public Request createRequest(UserOrder uo, Taxi t) {
		return new Request(uo, t);
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
		return new TaxiOrder(request.taxi, request.userOrder.destination);
	}
	
	public TaxiOrder getGl¿shaugenOrder(Taxi t) {
		return new TaxiOrder(t, "Gl¿shaugen, Trondheim, Norway");
	}
	
	public boolean debug(boolean var) {
		System.out.println("DEBUG MESSAGE");
		return var;
	}

}
