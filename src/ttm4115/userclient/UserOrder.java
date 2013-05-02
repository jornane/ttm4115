package ttm4115.userclient;

public class UserOrder {

	public final UserClient userClient;
	public final String destination;

	public UserOrder(UserClient userClient, String destination) {
		this.userClient = userClient;
		this.destination = destination;
	}

}
