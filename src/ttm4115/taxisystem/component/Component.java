package ttm4115.taxisystem.component;

import com.bitreactive.library.android.maps.model.Position;

import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	int taxiId;

	public int generateTaxiId() {
		return taxiId++;
	}

	public Position getStudenterSamfundetLocation() {
		return new Position(63.422528, 10.394729);
	}

	public Position getMoholtLocation() {
		return new Position(63.412658, 10.431862);
	}

}
