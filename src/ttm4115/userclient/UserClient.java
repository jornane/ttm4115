package ttm4115.userclient;

import ttm4115.dispatcher.Request;
import ttm4115.queue.QueuePosition;
import no.ntnu.item.arctis.runtime.Block;

public class UserClient extends Block {

	public ttm4115.userclient.UserOrder order;
	public java.lang.String name;
	public ttm4115.userclient.UserOrder orderTemp;

	public static String getAlias(String s) {
		return s;
	}
	public static String getAlias(Request r) {
		return getAlias(r.userOrder);
	}
	public static String getAlias(QueuePosition<UserOrder> qp) {
		return getAlias(qp.object);
	}
	public static String getAlias(UserOrder userOrder) {
		return userOrder.userClient.name;
	}

	public UserOrder createOrder(String destination) {
		return new UserOrder(this, destination);
	}

	public static String objectToString(Object o) {
		return o.toString();
	}
	public UserOrder nil() {
		return null;
	}

}
