package ttm4115.taxidispatcher;

import no.ntnu.item.arctis.runtime.Block;

public class TaxiDispatcher extends Block {

	private int taxiId = 0;

	public int generateTaxiId() {
		return taxiId ++;
	}

}
