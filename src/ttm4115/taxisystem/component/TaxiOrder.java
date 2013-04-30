package ttm4115.taxisystem.component;

import com.bitreactive.library.android.maps.model.Position;

public class TaxiOrder {

	public int taxiId;
	public Position position;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result + taxiId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxiOrder other = (TaxiOrder) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (taxiId != other.taxiId)
			return false;
		return true;
	}

	public TaxiOrder(int taxiId, Position position) {
		this.taxiId = taxiId;
		this.position = position;
	}
	
}
