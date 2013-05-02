package ttm4115.dispatcher;

import ttm4115.taxi.Taxi;
import ttm4115.userclient.UserOrder;
import no.ntnu.item.arctis.runtime.Block;

public class Dispatcher extends Block {

	public boolean taxisAvailable;
	public ttm4115.userclient.UserOrder activeOrder;

	public Request createRequest(UserOrder uo, Taxi t) {
		return new Request(uo, t);
	}

	public Taxi request2taxi(Request request) {
		return request.taxi;
	}

	public UserOrder request2order(Request request) {
		return request.userOrder;
	}

	public String order2location(UserOrder uo) {
		return uo.toString();
	}

	public boolean largerThanZero(int i) {
		return i > 0;
	}

}
