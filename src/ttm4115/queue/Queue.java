package ttm4115.queue;

import java.util.ArrayList;
import java.util.List;

import no.ntnu.item.arctis.runtime.Block;

public class Queue<T> extends Block {

	List<T> data;

	public void push(T o) {
		System.out.println("Queue: pushed "+o);
		data.add(o);
	}

	public T pop() {
		System.out.println("Queue: pop");
		if (data.size() == 0)
			return null;
		System.out.println("Queue: popped");
		return data.remove(data.size()-1);
	}

	public T shift() {
		System.out.println("Queue: shift");
		if (data.size() == 0)
			return null;
		System.out.println("Queue: shifted");
		return data.remove(0);
	}

	public QueuePosition<T> position(T o) {
		System.out.println("Queue: position of "+o+" is "+data.indexOf(o));
		return new QueuePosition<T>(o, data.indexOf(o));
	}

	public void cancel(Object o) {
		System.out.println("Queue: cancel "+o);
		data.remove(o);
	}

	public void construct() {
		System.out.println("Queue: construct");
		data = new ArrayList<T>();
	}

}
