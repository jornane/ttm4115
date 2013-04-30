package ttm4115.taxisystem.component;

import ttm4115.taxi.Taxi;

public class TaxiOrder {

	public final Taxi taxi;
	public final String position;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((taxi == null) ? 0 : taxi.hashCode());
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
		if (taxi == null) {
			if (other.taxi != null)
				return false;
		} else if (!taxi.equals(other.taxi))
			return false;
		return true;
	}

	public TaxiOrder(Taxi taxi, String position) {
		this.taxi = taxi;
		this.position = position;
	}
	
}
