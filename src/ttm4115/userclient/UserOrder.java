package ttm4115.userclient;

public class UserOrder {

	public final UserClient userClient;
	public final String destination;

	public UserOrder(UserClient userClient, String destination) {
		this.userClient = userClient;
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return destination;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result
				+ ((userClient == null) ? 0 : userClient.hashCode());
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
		UserOrder other = (UserOrder) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (userClient == null) {
			if (other.userClient != null)
				return false;
		} else if (!userClient.equals(other.userClient))
			return false;
		return true;
	}

}
