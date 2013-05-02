package ttm4115.queue;

import java.util.ArrayList;

import no.ntnu.item.arctis.runtime.Block;

public class Queue<T> extends Block {

	ArrayList<T> data = new ArrayList<T>();

	public void push(T o) {
		data.add(o);
	}

	public T pop() {
		if (data.size() == 0)
			return null;
		return data.remove(data.size()-1);
	}

	public T shift() {
		if (data.size() == 0)
			return null;
		return data.remove(0);
	}

	public QueuePosition<T> position(T o) {
		return new QueuePosition<T>(o, data.indexOf(o));
	}

	public void cancel(Object o) {
		data.remove(o);
	}

}
