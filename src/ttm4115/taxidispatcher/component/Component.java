package ttm4115.taxidispatcher.component;

import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	private int taxiId;

	public String generateTaxiId() {
		return "Taxi "+(taxiId++);
	}

}
