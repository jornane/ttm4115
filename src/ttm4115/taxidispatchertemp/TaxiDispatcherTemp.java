package ttm4115.taxidispatchertemp;

import no.ntnu.item.arctis.runtime.Block;

public class TaxiDispatcherTemp extends Block {

	private int taxiId;

	public int generateTaxiId() {
		return taxiId++;
	}

}
