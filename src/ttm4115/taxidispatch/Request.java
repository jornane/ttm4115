package ttm4115.taxidispatch;

import ttm4115.taxi.Taxi;

public class Request {

	public final UserOrder userOrder;
	public final Taxi taxi;

	public Request(UserOrder uo, Taxi t) {
		userOrder = uo;
		taxi = t;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taxi == null) ? 0 : taxi.hashCode());
		result = prime * result
				+ ((userOrder == null) ? 0 : userOrder.hashCode());
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
		Request other = (Request) obj;
		if (taxi == null) {
			if (other.taxi != null)
				return false;
		} else if (!taxi.equals(other.taxi))
			return false;
		if (userOrder == null) {
			if (other.userOrder != null)
				return false;
		} else if (!userOrder.equals(other.userOrder))
			return false;
		return true;
	}	
	
}
