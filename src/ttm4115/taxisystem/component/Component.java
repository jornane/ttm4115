package ttm4115.taxisystem.component;

import ttm4115.taxi.Taxi;

import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	private int taxiId = 0;

	public String getStudenterSamfundetLocation() {
		return "63.422528,10.394729";
	}

	public String getMoholtLocation() {
		return "63.412658,10.431862";
	}

	public TaxiOrder createTaxiOrder(Taxi taxi, String position) {
		return new TaxiOrder(taxi, position);
	}

	public int createTaxiId() {
		return taxiId++;
	}

}
