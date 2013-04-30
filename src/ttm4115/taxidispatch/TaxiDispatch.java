package ttm4115.taxidispatch;

import ttm4115.taxi.Taxi;
import no.ntnu.item.arctis.runtime.Block;

public class TaxiDispatch extends Block {

	public Request createRequest(UserOrder uo, Taxi t) {
		return new Request(uo, t);
	}

}
