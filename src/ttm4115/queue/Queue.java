package ttm4115.queue;

import java.util.ArrayList;

import no.ntnu.item.arctis.runtime.Block;

public class Queue extends Block {

	ArrayList<Object> data = new ArrayList<Object>();

	public void push(Object o) {
		data.add(o);
	}

	public Object pop() {
		if (data.size() == 0)
			return null;
		return data.remove(data.size()-1);
	}

	public Object shift() {
		if (data.size() == 0)
			return null;
		return data.remove(0);
	}

	public int count() {
		return data.size();
	}

	public void cancel(Object o) {
		data.remove(o);
	}

}
